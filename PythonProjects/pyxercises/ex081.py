n = []
while True:
    n.append(int(input('Digite algum número: ')))
    ask = str(input('Deseja continuar[S/N]? ')).strip().upper()[0]
    if ask == 'N':
        break
print(f'A quantidade de números que você digitou foi de {len(n)} números.')
n.sort(reverse=True)
print(f'Seus números de forma decrescente são {n}')
if 5 in n:
    print(f'O número 5 está presente nessa lista na posição {n.index(5)}')
else:
    print('O número 5 não está presente nessa lista.')
