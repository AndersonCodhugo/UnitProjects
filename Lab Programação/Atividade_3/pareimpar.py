lista = [1, 2, 3, 4, 9, 45, 90, 140, 150, 199]
pares = []
impares = []
cont = 0

while cont < len(lista):
    if lista[cont] % 2 == 0:
        pares.append(lista[cont])
    else:
        impares.append(lista[cont])
    cont += 1

print(f"Pares: {pares}")
print(f"Ímpares: {impares}")