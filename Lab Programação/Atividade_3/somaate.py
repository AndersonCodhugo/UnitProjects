soma = 0
cont = 1

valor = int(input('Digite um valor: '))

while cont <= 20:
    soma += valor + cont
    cont += 1

print(f'A soma de (x+1) até (x+20) é: {soma}')