preço = float(input('Qual o valor do produto? '))
print('''COMANDO P/ CONDIÇÕES DE PAGAMENTO
      
   [0] À vista Dinheiro/Cheque
   [1] À vista cartão
   [2] 2x cartão
   [3] 3x ou mais no cartão(20% de juros)
    ''')
cond = int(input('Digite a condição de pagamento: '))
avd = preço*0.90
avc = preço*0.95
c2 = preço
c3 = preço*1.20
if cond == 0:
    print('Seu produto à vista no dinheiro ou cheque sairá por {:.2f}R$ com 10% de desconto.'.format(avd))
elif cond == 1:
    print('Seu produto à vista no cartão sairá por {:.2f}R$ com 5% de desconto.'.format(avc))
elif cond == 2:
    print('Seu produto em 2x no cartão sairá por {:.2f}R$.'.format(c2))
elif cond == 3:
    print('Seu produto em 3x no cartão sairá por {:.2f}R$ com 20% de juros'.format(c3))
else:
    print('OPÇÃO INVÁLIDA. Tente novamente.')
    