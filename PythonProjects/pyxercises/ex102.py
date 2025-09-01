def fatorial(n, show=False):
    """ 
     -> Calcula o fatorial do número digitado.
    :param n: O número a ser calculado.
    :param show: (opcional) mostrar ou não a conta.
    :return: Retorna o valor de n.
    """
    f = 1
    for c in range(n, 0, -1):
        if show:
            print(c, end='')
            if c > 1:
                print(' x ', end='')
            else:
                print(' = ', end='')

        f *= c
    return f
print('-'*30)
print(fatorial(5, show=True))
