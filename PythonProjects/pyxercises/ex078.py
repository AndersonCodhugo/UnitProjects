num = []
maior = menor = 0
for n in range(0,5):
    num.append(int(input(f'Digite um número para a posição {n}: ')))
    if n == 0:
        maior = menor = num[n]
    else:
        if num[n] > maior:
            maior = num[n]
        if num[n] < menor:
            menor = num[n]
print(f'Os cinco números que você digitou foram {num}.')
print(f'O maior número que você digitou foi {maior} nas posições ', end='')
for loc, v in enumerate(num):
    if v == maior:
        print(f'{loc}->', end='')
print(' ')
print(f'O maior número que você digitou foi {menor} nas posições ', end='')
for loc, v in enumerate(num):
    if v == menor:
        print(f'{loc}->', end='')
print(' \nFIM DO PROGRAMA')