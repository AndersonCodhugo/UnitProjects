from datetime import date
ano = date.today().year
maior = 0
menor = 0
for pessoa in range (1,8):
    nasc=int(input('Digite a data de nascimento da {}ª pessoa: '.format(pessoa)))
    idade = ano - nasc
    if idade >= 18:
        maior += 1
    else:
        menor += 1
print('Dentre essas sete pessoas existem {} maiores e {} menores de idade.'.format(maior, menor))
#crie a variavel para maiores e menores começando de 0
#usar as condicionais para contar o que se deseja
#por fim fazer o programa dizer quantos contabilizou
