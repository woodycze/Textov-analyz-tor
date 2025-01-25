"""
election_craper.py: Třetí projekt do Engeto Online Python Akademie
author: Dominik Sodomka
email: dominiksodomka@gmail.com
discord: woodycz#0318
"""

import requests
from bs4 import BeautifulSoup
import csv
import sys
import argparse

# Funkce pro stažení HTML obsahu z URL
def fetch_html(url):
    try:
        response = requests.get(url)
        response.raise_for_status()
        return response.text
    except requests.RequestException as e:
        print(f"Chyba při stahování stránky: {e}")
        return None

# Funkce pro získání odkazů na obce z hlavní stránky
def get_obce_links(html):
    soup = BeautifulSoup(html, 'html.parser')
    obce = []
    for cell in soup.find_all('td', class_='cislo'):
        link_tag = cell.find('a')
        if link_tag:
            code = cell.text.strip()
            name = cell.find_next('td', class_='overflow_name').text.strip()
            link = f"https://www.volby.cz/pls/ps2017nss/{link_tag['href']}"
            obce.append({"code": code, "name": name, "link": link})
    return obce

# Funkce pro získání názvů politických stran z první obce
def get_party_names(html):
    soup = BeautifulSoup(html, 'html.parser')
    party_names = []
    for cell in soup.find_all('td', class_='overflow_name'):
        party_names.append(cell.text.strip())
    return party_names

# Funkce pro získání dat z jedné obce
def get_obec_data(html, party_names):
    soup = BeautifulSoup(html, 'html.parser')
    # Základní data
    registered = soup.find('td', class_='cislo', headers='sa2').text.strip()
    envelopes = soup.find('td', class_='cislo', headers='sa3').text.strip()
    valid = soup.find('td', class_='cislo', headers='sa5').text.strip()

    # Hlasy pro každou stranu
    party_votes = {party: 0 for party in party_names}
    for table_index in range(1, 4):  # Iterace přes možné tabulky (t1, t2, t3)
        name_headers = f't{table_index}sa1 t{table_index}sb2'
        vote_headers = f't{table_index}sa2 t{table_index}sb3'

        name_cells = soup.find_all('td', class_='overflow_name', headers=name_headers)
        vote_cells = soup.find_all('td', class_='cislo', headers=vote_headers)

        for name_cell, vote_cell in zip(name_cells, vote_cells):
            party_name = name_cell.text.strip()
            votes = int(vote_cell.text.strip().replace('\xa0', '').replace(',', '')) if vote_cell.text.strip().isdigit() else 0

            if party_name in party_votes:
                party_votes[party_name] += votes

    return registered, envelopes, valid, party_votes

# Funkce pro uložení dat do CSV souboru
def save_to_csv(filename, obce_data, party_names):
    fieldnames = ["code", "name", "registered", "envelopes", "valid"] + party_names
    with open(filename, mode='w', newline='', encoding='utf-8-sig') as file:
        writer = csv.DictWriter(file, fieldnames=fieldnames, delimiter=';')
        writer.writeheader()
        for obec in obce_data:
            writer.writerow(obec)

# Hlavní funkce
if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Scraper volebních výsledků.")
    parser.add_argument('url', help="URL hlavní stránky s odkazy na obce.")
    parser.add_argument('output_file', help="Název výstupního CSV souboru.")
    args = parser.parse_args()

    # Stažení hlavní stránky
    main_page_html = fetch_html(args.url)
    if not main_page_html:
        exit("Nepodařilo se stáhnout hlavní stránku.")

    # Získání seznamu obcí
    obce = get_obce_links(main_page_html)
    print(f"Nalezeno {len(obce)} obcí.")

    # Stažení první obce pro názvy stran
    first_obec_html = fetch_html(obce[0]['link'])
    if not first_obec_html:
        exit("Nepodařilo se stáhnout první obec.")
    party_names = get_party_names(first_obec_html)

    # Získání dat pro každou obec
    obce_data = []
    total_obce = len(obce)
    for index, obec in enumerate(obce, start=1):
        sys.stdout.write(f"\r{' ' * 80}\r")  # Vymaže předchozí řádek
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

    # Uložení dat do CSV
    save_to_csv(args.output_file, obce_data, party_names)
    print(f"\nData byla uložena do souboru {args.output_file}.")
