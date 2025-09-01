num = []
while True:
    n = int(input('Digite um número: '))
    if n not in num:
        num.append(n)
    else:
        print('Número já adicionado, tente outro ou encerre a lista.')
    ask = str(input('Deseja continuar[S/N]? ')).strip().upper()[0]
    while ask not in 'NS':
        ask = str(input('Comando inválido. Deseja continuar[S/N]? ')).strip().upper()[0]
    if ask in 'N':
        break
num.sort()
print(f'Seus números digitados em ordem são {num}.')
