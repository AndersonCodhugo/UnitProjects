lista = [1, 3, 5, 7, 11]

procura = int(input("Digite um número: "))


while procura not in lista:
    procura = int(input('Esse número não está na lista, digite outro:'))

print(f'O número {procura} está na lista na posição {lista.index(procura)}') 