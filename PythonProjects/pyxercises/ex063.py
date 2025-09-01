print('DESCUBRA A SEQUÊNCIA DE FIBONACCI!')
print(' ')
n = int(input('Digite o número de termos que deseja mostrar: '))
t1 = 0
t2 = 1
print ('{} -> {} -> '.format(t1,t2),end = '')
cont = 3
while cont <= n:
    t3 = t1 + t2
    print('{} -> '.format(t3),end='')
    t1 = t2
    t2 = t3
    cont += 1
print('FIM')
