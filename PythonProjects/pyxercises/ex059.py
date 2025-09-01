from time import sleep
n1 = int(input('Digite um número: '))
n2 = int(input('Digite outro número: '))
act = 1
while act != 5:
    act = int(input(''' 
MENU:
[1]SOMAR
[2]MULTIPLICAR
[3]VER O MAIOR
[4]DIGITAR NOVOS NÚMEROS
[5]SAIR DO PROGRAMA
>>O que você deseja fazer com esses 2 números? '''))
    if act == 1:
        print('\033[0;031;43mO número {} + {} é igual a {}.\033[m'.format(n1,n2,n1+n2))
    elif act == 2:
        print('\033[0;031;43mO número {} multiplicado {} vezes é igual a {}.\033[m'.format(n1,n2,n1*n2))
    elif act == 3:
        if n1 < n2:
            print('\033[0;031;43mO número {} é o maior.\033[m'.format(n2))
        else:
            print('\033[0;031;43mO número {} é o maior.\033[m'.format(n1))
    elif act == 4:
        print('Informe os valores novamente')
        n1 = int(input('Digite um novo número: '))
        n2 = int(input('Digite outro novo número: '))
    elif act == 5:
        print('Encerrando...')
    else:
        print('Comando não reconhecido, tente novamente.')       
sleep(2)    
print('-----\033[31mPROGAMA FINALIZADO\033[m-----')
