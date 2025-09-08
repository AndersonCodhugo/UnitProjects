def somaDigitos(numero):
    if numero == 0:
        return 0
    return numero % 10 + somaDigitos(numero // 10)

print(somaDigitos(14544623))