from random import randint #importando a biblioteca para randomizar um numero inteiro
print('°'*40)
print('VAMOS JOGAR PAR OU IMPAR')
print('°'*40)
cont = 0
while True:
    player = int(input('Digite um número: '))
    pc = randint(0, 10)
    soma = pc + player
    tipo = ' '
    while tipo not in 'PI':
        tipo = str(input('Par ou Impar? ')).strip().upper()[0]
    if tipo == 'P':
        if soma % 2 == 0:
            print('Você venceu!')
            cont += 1
        else:
            print('Você perdeu')
            break
    elif tipo == 'I':
        if soma % 2 == 1:
            print('Você venceu!')
            cont += 1
        else:
            print('Você perdeu')
            break
print(f'E ainda perdeu depois de conseguir {cont} vitórias consecutivas.')
