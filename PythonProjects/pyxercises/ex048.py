soma = 0
cont = 0
for c in range (1, 501, 2):
    if c % 3 ==0:
        soma += c
        cont += 1
print('A soma dos números impares de 1 a 500 é igual á {}'.format(soma))
print('FIM DO PROGRAMA')