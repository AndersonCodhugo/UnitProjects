from time import sleep
print('Olá, vamos iniciar o processo de empréstimo para a compra do seu imóvel.')
sleep(1)
casa = float(input('Qual o valor da casa que deseja comprar? '))
salário = float(input('Quanto você recebe de salário por mês? '))
anos = int(input('Em quantos anos você espera pagar pela casa? '))
pagmen = casa/(anos*12)
print('Analisando...')
sleep(2)
print('Aguarde um instante...')
sleep(2)
if 0.30*salário > pagmen:
    print('Parabéns!Seu empréstimo foi \033[0;32maprovado\033[m Ele vai custar {:.2f} por mês.'.format(pagmen))
else:
    print('Desculpe, seu empréstimo foi \033[0;31mnegado\033[m. Seu salário não é suficiente para está transação de {:.2f} por mês.'.format(pagmen))
