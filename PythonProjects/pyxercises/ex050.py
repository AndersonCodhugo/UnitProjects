soma = 0
for c in range (1, 7):
    n = int(input('Digite um número por favor: '))
    if n % 2 == 0:
     soma += n
print('A soma apenas dos números pares que você digitou é igual á {}.'.format(soma))
