print('BEM VINDO AO SID BANK')
valor = int(input('Qual o valor que você deseja sacar? '))
total = valor
cedula = 50
totalcedulas = 0
while True:
    if total >= cedula:
        total -= cedula
        totalcedulas += 1
    else:
        if totalcedulas >0:
            print(f'Foram um total de {totalcedulas} de R${cedula}')
        if cedula == 50:
            cedula = 20
        elif cedula == 20:
            cedula = 10
        elif cedula == 10:
            cedula = 1
        totalcedulas = 0
        if total == 0:
            break
print('FIM DO PROGRAMA - VOLTE SEMPRE AO BANCO')
