numeros = [[] , []]
valor = 0
for c in range(1, 8):
    valor = int(input(f'Digite o {c}° número: '))
    if valor % 2 == 0:
        numeros[0].append(valor)
    else:
        numeros[1].append(valor)
print(f'Todos os seus números foram: {numeros}')
print(f'Os números pares são {sorted(numeros[0])}.')
print(f'Os números impares são {sorted(numeros[1])}.')
