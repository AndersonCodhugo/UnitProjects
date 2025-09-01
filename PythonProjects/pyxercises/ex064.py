n = 0
qtd = 0
soma = 0
n = int(input('Digite um número[999 para cancelar]: '))
while n != 999:
    soma = soma + n
    qtd += 1
    n = int(input('Digite um número[999 para cancelar]: '))
print('Você digitou {} números e a soma deles é igual á {}'.format(qtd,soma))
#mais facil do que parecia