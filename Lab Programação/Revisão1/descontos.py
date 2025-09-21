def descontoCompra(valor):
    #definindo valor inicial com desconto
    valorComDesconto = 0
    
    if valor > 200:
        valorComDesconto = valor * 0.8
    elif valor >= 100:
        valorComDesconto = valor * 0.9
    else:
        valorComDesconto = valor
    print(valorComDesconto)
    
compra = float(input("Digite o valor da sua compra: "))
print(f'O valor da sua compra com desconto é de R${compra:.2f}')
 