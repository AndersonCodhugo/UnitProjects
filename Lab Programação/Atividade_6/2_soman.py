def somaAteN(numero):
    if numero < 0:
        return "Apenas números positivos"
    if numero == 0:
        return 0
    return numero + somaAteN(numero - 1)

num = int(input('Digite um número para uma soma aritmética: '))

print(somaAteN(num))