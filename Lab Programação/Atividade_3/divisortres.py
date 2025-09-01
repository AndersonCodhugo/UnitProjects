n = int(input("Digite um valor N: "))
cont = 1
soma = 0

while cont <= n:
    if cont % 3 == 0:
        soma += cont
    cont += 1

print(soma)