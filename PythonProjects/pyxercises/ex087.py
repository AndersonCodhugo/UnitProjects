matriz= [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
somapar = 0
for l in range(0, 3):
    for c in range(0, 3):
        matriz[l][c] = int(input(f'Digite um valor para a posição {l}, {c}: '))
        if matriz[l][c] % 2 == 0:
           somapar += matriz[l][c] 
for l in range(0, 3):
    for c in range(0, 3):
        print(f'[{matriz[l][c]:^3}]', end='')
    print()
print(f'A soma dos números pares dessa matriz foi {somapar}.')
print(f'A soma dos valores da terceira coluna dessa matriz é de {matriz[0][2] + matriz[1][2] + matriz[2][2]}.')
print(f'O maior valor da segunda linha dessa matriz é {max(matriz[1])}.')
