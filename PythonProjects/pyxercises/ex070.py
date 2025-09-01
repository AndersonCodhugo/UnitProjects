print('BEM VINDO AO SUPERMERCADO ONLINE')
soma = milao = cont = menor = 0
barato = '' 
while True:
    produto = str(input('NOME DO PRODUTO: '))
    valor = float(input('VALOR DO PRODUTO R$'))
    cont += 1
    if cont == 1 or valor < menor:
        menor = valor
        barato = produto
    if valor >0:
        soma += valor
        if valor > 1000:
            milao += 1
    ask = ' '
    while ask not in 'SN':
        ask = str(input('DESEJA CONTINUAR[S/N]? ')).strip().upper()[0]
    if ask == 'N':
        break 
print(f'''
O total dessa lista de produtos fica no valor de R${soma}.
Existe nessa lista um total de {milao} produtos custando mais do que R$1000.
{barato} é o produto mais barato nessa lista custando R${valor:.2f}.     ''')