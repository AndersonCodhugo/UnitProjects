produtos = ('Televisão', 1999.90,
            'Celular', 999.90,
            'Headset', 349.90,
            'Fire Stick', 249.90,
            'Microfone', 149.90,
            'Mouse', 174.90,
            'Teclado', 299.90,
            'Processador', 4999.90,
            'Controle PS4', 379.90)
print('_'*40)
print(f'{'LISTA DE PRODUTOS E PREÇOS':^38}')
print('_'*40)
for pos in range(0, len(produtos)):
    if pos % 2 == 0:
        print(f'{produtos[pos]:.<30}', end='')
    else:
        print(f'{produtos[pos]:>7.2f}')
print('_'*40)