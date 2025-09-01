def aumentar(preço = 0, taxa = 0, formato = False):
    res = preço + (preço * taxa / 100)
    return res if formato is False else moeda(res)


def diminuir(preço = 0, taxa = 0, formato = False):
    res = preço - (preço * taxa / 100)
    return res if formato is False else moeda(res)


def dobro(preço = 0, formato = False):
    res = preço * 2
    return res if formato is False else moeda(res)


def metade(preço = 0, formato = False):
    res = preço / 2
    return res if formato is False else moeda(res)


def moeda(preço = 0, moeda = 'R$'):
        return f'{moeda}{preço:.2f}'.replace('.',',')
    

def resumo(valor, max = 0, dim = 0):
    import moeda
    print(f''' 
-----------------------------------------
             RESUMO DO VALOR
-----------------------------------------
Preço analisado:{(moeda.moeda(valor)):>20}
Dobro do preço:{(moeda.dobro(valor, True)):>20}
Metade do preço:{(moeda.metade(valor, True)):>20}
{max}% de aumento:{(moeda.aumentar(valor, max, True)):>20}
{dim}% de redução:{(moeda.diminuir(valor, dim, True)):>20}
''')
