import math
num = float(input('Digite um número com três casas decimais: '))
print('Seu numéro {} convertido para inteiro é:{}'.format(num, math.trunc(num)))
#para aliviar o código eu poderia escrever from math import trunc e
#na linha do codigo tiro o (.math) se não fica sem funcionar
#sem importar modulos eu coloco ele como inteiro ex: int(num) para o valor