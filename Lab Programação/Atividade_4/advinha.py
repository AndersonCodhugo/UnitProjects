# QUESTÃO 2

import random

num = random.randint(1, 100)

print('Tente advinhar um número de 1 a 100: ')

for c in range(1,8):
    tentativa = int(input(f'Palpite {c} de 7: '))
    if tentativa == num:
        print('Você acertou!')
        break
    elif tentativa < num:
        print('Tente um número maior.')
    elif tentativa > num:
        print('Tente um número menor.')
        
print('Acabraram suas tentativas você perdeu!')

