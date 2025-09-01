import datetime

data = datetime.datetime.now()

compra = float(input('Qual o valor da sua compra: '))
mes = int(input('Digite seu mês de nascimento: '))

if mes == data.month:
    print(f'''Parabéns você ganhou 10% de desconto! \n O valor da sua compra será: R${compra * 0.9:.2f}''')
else:
    print(f'Sem desconto para você. Valor da sua compra: {compra:.2f}')