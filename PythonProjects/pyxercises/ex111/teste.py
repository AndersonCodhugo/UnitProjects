import sys
sys.path.append('c:/Users/Anderson/Documents/PythonProjects/pyxercises')
from ex111.utilidadesCeV import moeda
p = float(input('Digite o preço: R$'))
moeda.resumo(p, 80, 35)
