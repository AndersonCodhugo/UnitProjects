n1 = int(input('Digite um número: '))
n2 = int(input('Digite outro número: '))

operacao = str(input('Você deseja somar, subtrair, multiplicar ou dividir?(+, -, * ou /)'))

if operacao == '+' :
    print(f'{n1} + {n2} = {n1 + n2}')
elif operacao == '-' :
    print(f'{n1} - {n2} = {n1 - n2}')
elif operacao == '*' :
    print(f'{n1} * {n2} = {n1 * n2}')
elif operacao == '/' :
    print(f'{n1} / {n2} = {n1 / n2}')
else:
    print('Operação Inválida!')