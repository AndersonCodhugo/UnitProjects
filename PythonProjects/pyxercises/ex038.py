from time import sleep
n1 = int(input('Digite um número: '))
n2 = int(input('Digite outro número: '))
print('\033[0;36mComparando números. Aguarde..\033[m')
sleep(2)
if n1>n2:
    print('O número {} é o maior'.format(n1))
elif n2>n1:
    print('O número {} é o maior'.format(n2))
else:
    print('Não existe diferença entre esses números.')
