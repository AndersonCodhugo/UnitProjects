cont = 0
soma = 0
valor = int(input('Digite um valor: '))

while cont < valor:
    cont += 1
    if cont % 2 == 0:
        soma = soma + cont
print(soma)