dias = int(input('Por quantos dias o carro foi alugado? '))
km = float(input('Quantos quilômetros foram rodados com o carro? '))
valor = dias*70 + km*0.15
print('O valor a ser pago pelo uso do carro é de: R${:.2f}'.format(valor))