produto = str(input('Nome do produto: '))
qtd = int(input(f'Quantidade de {produto}?'))

if qtd <10:
    print(f'Estoque baixo: reabastecer {produto}.')
else:
    print('Estoque suficiente!')