maior = 0
menor = 0
for pessoa in range (1, 6):
    peso = float(input('Qual o peso da {}ª pessoa? (Kg)'.format(pessoa)))
    if pessoa == 1: 
        maior = peso
        menor = peso
    else:
        if peso > maior:
            maior = peso
        if peso < menor:
            menor = peso
print('O menor peso foi de {}Kg e o maior foi de {}Kg entre todos os dados.'.format(menor, maior))
