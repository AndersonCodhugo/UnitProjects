def aumentar(preço = 0, formato = False):
    res = preço * 1.10
    return res if formato is False else moeda(res)


def diminuir(preço = 0, formato = False):
    res = preço * 0.87
    return res if formato is False else moeda(res)


def dobro(preço = 0, formato = False):
    res = preço * 2
    return res if formato is False else moeda(res)


def metade(preço = 0, formato = False):
    res = preço / 2
    return res if formato is False else moeda(res)


def moeda(preço = 0, moeda = 'R$'):
        return f'{moeda}{preço:.2f}'.replace('.',',')
    