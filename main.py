import requests
from bs4 import BeautifulSoup

def decode_secret_message(url: str):
    response = requests.get(url)
    soup = BeautifulSoup(response.text, "html.parser")

    rows = soup.find_all("tr")
    entries = []

    for row in rows[1:]:
        cols = row.find_all("td")
        if len(cols) == 3:
            try:
                x = int(cols[0].get_text(strip=True))
                char = cols[1].get_text(strip=True)
                y = int(cols[2].get_text(strip=True))
                entries.append((x, y, char))
            except ValueError:
                continue

    if not entries:
        print("No data found.")
        return

    max_x = max(e[0] for e in entries)
    max_y = max(e[1] for e in entries)

    grid = [[" " for _ in range(max_x + 1)] for _ in range(max_y + 1)]

    for x, y, char in entries:
        grid[y][x] = char

    for row in grid:
        print("".join(row))


decode_secret_message(
    "https://docs.google.com/document/d/e/2PACX-1vSvM5gDlNvt7npYHhp_XfsJvuntUhq184By5xO_pA4b_gCWeXb6dM6ZxwN8rE6S4ghUsCj2VKR21oEP/pub"
)