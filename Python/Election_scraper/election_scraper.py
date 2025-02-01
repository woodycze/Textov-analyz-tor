"""
election_scraper.py: Třetí projekt do Engeto Online Python Akademie
author: Dominik Sodomka
email: dominiksodomka@gmail.com
discord: woodycz#0318
"""

import requests
from bs4 import BeautifulSoup
import csv
import sys
import argparse

def fetch_html(url):
    """Stáhne HTML obsah z dané URL."""
    try:
        response = requests.get(url)
        response.raise_for_status()
        return response.text
    except requests.RequestException as e:
        print(f"Chyba při stahování stránky: {e}")
        return None
        
def get_obce_links(html):
    """Získá odkazy na obce z hlavní stránky."""
    soup = BeautifulSoup(html, 'html.parser')
    obce = []
    for cell in soup.find_all('td', class_='cislo'):
        link_tag = cell.find('a')
        if link_tag:
            code = cell.text.strip()
            name_cell = cell.find_next('td', class_='overflow_name')
            name = name_cell.text.strip() if name_cell else ""
            link = f"https://www.volby.cz/pls/ps2017nss/{link_tag['href']}"
            obce.append({"code": code, "name": name, "link": link})
    return obce

def get_party_names(html):
    """Získá názvy politických stran z HTML první obce."""
    soup = BeautifulSoup(html, 'html.parser')
    party_names = []
    for cell in soup.find_all('td', class_='overflow_name'):
        party_names.append(cell.text.strip())
    # Odstranění duplicit zachováním pořadí
    seen = set()
    unique_party_names = []
    for name in party_names:
        if name not in seen:
            unique_party_names.append(name)
            seen.add(name)
    return unique_party_names

def parse_basic_data(soup):
    """Extrahuje základní data o voličích z dané obce."""
    registered = soup.find('td', class_='cislo', headers='sa2').text.strip()
    envelopes = soup.find('td', class_='cislo', headers='sa3').text.strip()
    valid = soup.find('td', class_='cislo', headers='sa5').text.strip()
    return registered, envelopes, valid

def parse_party_votes(soup, party_names):
    """Extrahuje hlasy pro politické strany."""
    party_votes = {party: 0 for party in party_names}
    for table_index in range(1, 4):
        name_headers = f't{table_index}sa1 t{table_index}sb2'
        vote_headers = f't{table_index}sa2 t{table_index}sb3'
        name_cells = soup.find_all('td', class_='overflow_name', headers=name_headers)
        vote_cells = soup.find_all('td', class_='cislo', headers=vote_headers)
        for name_cell, vote_cell in zip(name_cells, vote_cells):
            party_name = name_cell.text.strip()
            vote_text = vote_cell.text.strip().replace('\xa0', '').replace(',', '')
            try:
                votes = int(vote_text)
            except ValueError:
                votes = 0
            if party_name in party_votes:
                party_votes[party_name] += votes
    return party_votes

def get_obec_data(html, party_names):
    """Získá kompletní data pro jednu obec (základní statistiky a hlasy stran)."""
    soup = BeautifulSoup(html, 'html.parser')
    registered, envelopes, valid = parse_basic_data(soup)
    party_votes = parse_party_votes(soup, party_names)
    return registered, envelopes, valid, party_votes

def save_to_csv(filename, obce_data, party_names):
    """Uloží data do CSV souboru."""
    fieldnames = ["code", "name", "registered", "envelopes", "valid"] + party_names
    try:
        with open(filename, mode='w', newline='', encoding='utf-8-sig') as file:
            writer = csv.DictWriter(file, fieldnames=fieldnames, delimiter=';')
            writer.writeheader()
            for obec in obce_data:
                writer.writerow(obec)
    except IOError as e:
        print(f"Chyba při zápisu do souboru {filename}: {e}")

def validate_input():
    """Zpracuje argumenty příkazové řádky a ověří je."""
    parser = argparse.ArgumentParser(description="Scraper volebních výsledků.")
    parser.add_argument('url', help="URL hlavní stránky s odkazy na obce.")
    parser.add_argument('output_file', help="Název výstupního CSV souboru.")
    args = parser.parse_args()
    return args

def fetch_and_parse_main_page(url):
    """Stáhne hlavní stránku a získá seznam obcí."""
    main_page_html = fetch_html(url)
    if not main_page_html:
        sys.exit("Nepodařilo se stáhnout hlavní stránku.")
    obce = get_obce_links(main_page_html)
    print(f"Nalezeno {len(obce)} obcí.")
    if not obce:
        sys.exit("Nebyly nalezeny žádné obce.")
    return obce

def fetch_party_names(obce):
    """Získá názvy politických stran z první obce."""
    first_obec_html = fetch_html(obce[0]['link'])
    if not first_obec_html:
        sys.exit("Nepodařilo se stáhnout data první obce pro získání názvů stran.")
    return get_party_names(first_obec_html)

def process_all_obce(obce, party_names):
    """Iteruje přes všechny obce a zpracovává jejich data."""
    obce_data = []
    total_obce = len(obce)
    for index, obec in enumerate(obce, start=1):
        sys.stdout.write(f"\r{' ' * 80}\r")
        sys.stdout.write(f"Zpracovávám obec {index} z {total_obce}: {obec['name']}")
        sys.stdout.flush()

        obec_html = fetch_html(obec['link'])
        if not obec_html:
            print(f"\nNepodařilo se stáhnout data pro obec: {obec['name']}")
            continue

        registered, envelopes, valid, party_votes = get_obec_data(obec_html, party_names)
        obec_data = {
            "code": obec['code'],
            "name": obec['name'],
            "registered": registered,
            "envelopes": envelopes,
            "valid": valid,
        }
        obec_data.update(party_votes)
        obce_data.append(obec_data)
    return obce_data

def main():
    """Hlavní funkce, která řídí stahování a zpracování dat."""
    args = validate_input()
    obce = fetch_and_parse_main_page(args.url)
    party_names = fetch_party_names(obce)
    obce_data = process_all_obce(obce, party_names)
    save_to_csv(args.output_file, obce_data, party_names)
    print(f"\nData byla uložena do souboru {args.output_file}.")

if __name__ == "__main__":
    main()
