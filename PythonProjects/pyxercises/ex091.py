from random import randint
from time import sleep
from operator import itemgetter as ig
jogos = {'jogador1': randint(1,6) , 'jogador2': randint(1,6) , 'jogador3': randint(1,6) , 'jogador4': randint(1,6)}
ranking = dict()
for j, v in jogos.items():
    print(f'O {j} tirou o valor {v} no dado.')
    sleep(0.8)
ranking = sorted(jogos.items(), key=ig(1), reverse=True)
for i, p in enumerate(ranking):
    print(f'{i+1}° Lugar: {p[0]} com {p[1]} pontos.')
    sleep(1)
