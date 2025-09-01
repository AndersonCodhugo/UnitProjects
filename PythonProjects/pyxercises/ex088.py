from random import randint
from time import sleep
print(' ')
print('BEM VINDO AO SORTEADOR DE NÚMEROS DA MEGA-SENA!')
print(' ')
lista = []
jogos = []
quant = int(input('Quantos jogos você deseja que sejam sorteados? '))
tot = 1
while tot <= quant:
    cont = 0
    while True:
        num = randint(1, 60)
        if num not in lista:
            lista.append(num)
            cont +=1
        if cont >= 6:
            break
    lista.sort()
    jogos.append(lista[:])
    lista.clear()
    tot += 1
sleep(1.5)
print('Sorteando números...')
sleep(1)
print(f'Foram sorteados {quant} jogos para você e esses são:')
sleep(1)
for i, l in enumerate(jogos):
    print(f'Jogo {i+1}: {l}')
    sleep(0.7)
