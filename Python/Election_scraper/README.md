Tento program stahuje a zpracovává volební výsledky z České republiky. Výsledky pro jednotlivé obce získává z webové stránky https://www.volby.cz/, data zpracovává a ukládá do souboru CSV.
Ujistěte se, že máte nainstalován Python.
Nainstalujte potřebné knihovny pomocí - pip install beautifulsoup4 requests

Spuštění programu: Spusťte program pomocí příkazového řádku s dvěma argumenty:
První argument: URL stránky s odkazy na obce.
Druhý argument: Název výstupního souboru CSV, kam se data uloží.
Příklad spuštění: python election_scraper.py "https://www.volby.cz/pls/ps2017nss/ps32?xjazyk=CZ&xkraj=2&xnumnuts=2103" "vysledky_kladno.csv"
