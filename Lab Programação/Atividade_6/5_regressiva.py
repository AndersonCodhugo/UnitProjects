def contagemRegressiva(numero):
    if numero < 0:
        return
    print(numero)
    contagemRegressiva(numero - 1)

contagemRegressiva(5)