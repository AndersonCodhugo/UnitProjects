import sys
sys.path.append('c:/Users/Anderson/Documents/PythonProjects/pyxercises')
from ex108 import moeda
p = float(input('Digite o preço: R$'))
print(f'A metade de {p} é {moeda.metade(p)}.')
print(f'O dobro de {p} é {moeda.dobro(p)}.')
print(f'Aumentando 10% de {p}, temos {moeda.aumentar(p):.2f}.')
print(f'Reduzindo 13% de {p}, temos {moeda.diminuir(p):.2f}.')
