lista = [1, 2, 3, 4, 5, 20, 40, 130, 190, 360]
maior = lista[0]
cont = 1

while cont < len(lista):
    if lista[cont] > maior:
        maior = lista[cont]
    cont += 1

print(f"O maior elemento da lista é: {maior}")