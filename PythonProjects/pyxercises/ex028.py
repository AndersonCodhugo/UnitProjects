from random import randint
num=int(input('Pensei em um número entre 0 e 5, tente advinhar: '))
a=randint(0,5)#pensamento do computador
if num == a:
    print('Parabens. Você acertou!')
else:
    print('Você errou, meu número era {}.'.format(a))
