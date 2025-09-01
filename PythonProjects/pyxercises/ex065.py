soma = média = qtd = maior = menor = 0
n = 1
resp = 'S'
while resp in 'Ss':
    n = int(input('Digite um número: '))
    resp = str(input('Quer digitar mais um número?[S/N]: ')).upper().strip()[0]
    soma += n
    qtd += 1
    if qtd == 1:
        maior = menor = n
    else:
        if n > maior:
            maior = n
        if n < menor:
            menor = n
média = soma / qtd
print('Você digitou {} números e média entre eles é de {:.2f}.'.format(qtd, média))
print('O maior entre esses números é o {} e o menor é {}.'.format(maior, menor))
#Crie um programa que leia vários números inteiros pelo teclado.
#No final da execução, mostre a média entre todos os valores e qual foi o maior e o menor valores lidos. 
#O programa deve perguntar ao usuário se ele quer ou não continuar a digitar valores.
