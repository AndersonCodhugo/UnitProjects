from time import sleep
all = []
par = []
impar = []
while True:
    numero = int(input('Digite um número para ser adicionado a lista: '))
    all.append(numero)
    if numero % 2 == 0:
        par.append(numero)
    else:
        impar.append(numero)

    ask = str(input('Deseja continuar adicionando números[S/N]? ')).strip().upper()[0]
    while ask not in 'SN':
        print('COMANDO INVÁLIDO')
        sleep(1)
        ask = str(input('Deseja continuar adicionando números[S/N]? ')).strip().upper()[0]
    if ask == 'N':
        break
print(f'Os seus números foram: {all}.')
print(f'Os seus números pares foram: {par}.')
print(f'Os seus números impares foram: {impar}.')
print('FIM DO PROGRAMA.')
