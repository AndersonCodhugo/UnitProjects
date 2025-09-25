import requests

url = "https://app.omie.com.br/api/v1/financas/mf/"

payload = {
        "call":"ListarMovimentos",
        "param":[{"nPagina":1,"nRegPorPagina":5}],
        "app_key":"5614700718627",
        "app_secret":"2ae8328ce879960d99ba83e7986805a3"
}

headers = {
    "Content-Type": "application/json"
}

response = requests.post(url, json=payload, headers=headers)

print(response.status_code)
print(response.json())