import random
numeros = [random.randint(1, 100) ,random.randint(1, 100) ,random.randint(1, 100) ,random.randint(1, 100) ,random.randint(1, 100) ,random.randint(1, 100) ,random.randint(1, 100) ,random.randint(1, 100) ,random.randint(1, 100) ,random.randint(1, 100) ,]
print('Lista de números:',numeros)
print('Lista de pares:')
for val in numeros:
    if val % 2 == 0:
        print(val, end=" ")

print('\nSoma dos números:', sum(numeros))