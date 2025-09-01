from time import sleep
f = int(input('Digite um número para descobrir o valor do seu fatorial: '))
cont = f
fator = 1
while cont > 0:
    print('{}'.format(cont), end = '')
    print('x' if cont > 1 else ' = ',end='')
    fator *= cont
    cont -= 1
print('{}'.format(fator))
sleep(1.5)
print('FIM DO PROGRAMA')
