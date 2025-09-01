from time import sleep
from math import factorial
f = 1
while f != 0:
    f = int(input('''Digite um número para descobrir o seu fatorial
Ou digite 0 para cancelar o programa
NÚMERO: '''))
    if f != 0:
        print('O Fatorial de {} é {}.'.format(f,factorial(f)))
print('Cancelando programa...')
sleep(1.5)
print('FIM DO PROCESSO')
