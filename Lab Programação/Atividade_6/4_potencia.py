def potencia(numero, expoente):
    if numero and expoente == 0 or numero and expoente == 1:
        return 1
    return numero**expoente

print(potencia(2,3))