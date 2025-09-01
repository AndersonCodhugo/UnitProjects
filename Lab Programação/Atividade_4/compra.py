# QUESTÃO 5

compras = 0

while True:
    valor = float(input('Digite o valor do produto: '))

    if valor == 0:
        break

    compras = compras + valor

if compras <= 100:
    print('Você recebeu 0% de desconto.')
    print(f'Valor final da compra: R${compras:.2f}')
elif compras > 100 and compras <= 500:
    print(f'O valor de suas compras foram de R${compras:.2f} e você recebeu 10% de desconto.')
    print(f'Valor final da compra: R${compras*0.9:.2f}')
elif compras > 500:
    print(f'O valor de suas compras foram de R${compras:.2f} e você recebeu 20% de desconto.')
    print(f'Valor final da compra: R${compras*0.8:.2f}')