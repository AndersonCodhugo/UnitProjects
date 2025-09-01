pessoas = []
dados = []
pesado = leve = 0   
while True:
    dados.append(str(input('Nome da pessoa: ')))
    dados.append(float(input('Peso dessa pessoa: ')))
    if len(pessoas) == 0:
        pesado = leve = dados[1]
    else:
        if dados[1] > pesado:
            pesado = dados[1]
        if dados[1] < leve:
            leve = dados[1]
    pessoas.append(dados[:])
    dados.clear()

    perg = str(input('Deseja continuar[S/N]? ')).strip().upper()[0]
   
    if perg == 'N':
        break
print(f'Foram adicionadas {len(pessoas)} pessoas a lista.')
print(f'O maior peso foi {pesado} ', end='')
for p in pessoas:
    if p[1] == pesado:
        print(f'[{p[0]}]', end = '')
print()
print(f'O menor peso foi {leve} ', end='')
for p in pessoas:
    if p[1] == leve:
        print(f'[{p[0]}]', end='')
print()
print('FIM DO PROGRAMA')
