from time import sleep
def contador(i, f, p):
    """
    Ainda nao sei o que escrever nem onde utilizar
    """

    c = i
    while c <= f:
        print(f'{c}', end='..')
        c += p 
    print('FIM')


contador(2, 10, 2)
help(contador)
