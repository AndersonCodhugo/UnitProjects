from random import randint
from time import sleep #library para adicionar tempo de respostas
pc= randint(0,10)#pensamento do pc
print('?'*57)
print('Estou pensando em um número entre 0 e 10. Tente advinha-lo')
print('?'*57)
print(' ')
sleep(1.5)
player=int(input('O número é? '))#pergunta para o jogador
while player != pc:
    player = int(input('Tente Novamente: '))
    if player > pc:
        print('É um número mais baixo...')
    elif player < pc:
        print('É um número mais alto...')
    print(' ')
    print('PROCESSANDO...')
    print(' ')
    sleep(1)
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
