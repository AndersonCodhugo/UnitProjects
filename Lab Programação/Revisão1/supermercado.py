produtos = []

for p in range(5):
    produto = str(input(f"Digite o {p+1}° produto: ")).upper()
    produtos.append(produto)

listaOrdenada = sorted(produtos)
print('')

if 'ARROZ' in listaOrdenada:
    print("ARROZ ESTÁ PRESENTE NA LISTA.")
else:
    print("ARROZ NÃO ESTÁ PRESENTE NA LISTA.")

print('Sua lista em ordem: ', listaOrdenada)
