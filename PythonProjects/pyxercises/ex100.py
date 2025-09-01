from time import sleep
from random import randint


def sorteia(lista):
    print('SORTEANDO 5 VALORES: ')
    for cont in range (0, 5):
        n = randint(1, 10)
        lista.append(n)
        print(f'{n} ', end='', flush=True)
        sleep(0.3)
    sleep(1)
    print('FINALIZADO')


def somaPar(lista):
    soma = 0
    for valor in lista:
        if valor % 2 == 0:
            soma += valor
    print(f'Somando os valores pares de {lista}, temos o valor {soma}.')

números = []
sorteia(números)
sleep(1.5)
somaPar(números)
