from random import randint
from time import sleep #library para adicionar tempo de respostas
pc= randint(0,5)#pensamento do pc
print('?'*57)
print('Estou pensando em um número entre 0 e 5. Tente advinha-lo')
print('?'*57)
print(' ')
sleep(3)
player=int(input('O número é? '))#pergunta para o jogador
print(' ')
print('PROCESSANDO...')
print(' ')
sleep(2)
if player == pc:
    print('/'*41)
    print('Meus parabéns, você acertou o meu número!')
    print('/'*41)
    print(' ')
else:
    print('X'*32)
    print('Você errou :( O meu número era {}'.format(pc))
    print('X'*32)
    print(' ')
print("""       MUITO OBRIGADO POR JOGAR!
                    FIM.""")
