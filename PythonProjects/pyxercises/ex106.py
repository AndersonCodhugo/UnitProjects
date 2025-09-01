c = ('\033[m', '\033[0;32;41m', '\033[7;30m')


def ajuda(com):
    print(f'ACESSANDO MANUAL DO COMANDO "{com}"')
    print(c[2], end='')
    help(com)
    print(c[0], end='')


def Título(msg, cor = 0):
    tam = len(msg) + 4
    print(c[cor], end = '')
    print('*'*tam)
    print(f'  {msg}  ')
    print('*'*tam)
    print(c[0], end='')

comando = ''
while True:
    Título('SISTEMA DE AJUDA PyHELP', 1)
    comando = str(input('Função ou Biblioteca  > '))
    if comando.upper() == 'FIM':
        break
    else:
        ajuda(comando)
Título('ATÉ LOGO', 1)
from ex105 import notas
print(notas)