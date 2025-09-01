print('BEM VINDO. Vamos calcular seu IMC(Indíce de Massa Corporal).')
peso=float(input('Qual o seu peso atual em quilos? '))
altura=float(input('Qual a sua altura atual em metros? '))
imc= peso/(altura**2)
if imc < 18.5:
    print(f'Você está ABAIXO DO PESO com um IMC de {imc:.1f}.')
elif imc >= 18.5 and imc < 25:
    print(f'Você está no PESO NORMAL com um IMC de {imc:.1f}.')
elif imc >= 25 and imc < 30:
    print(f'Você está com SOBREPESO com um IMC de {imc:.1f}. ')
elif imc >= 30:
    print(f'Você está com OBESIDADE com um IMC de {imc:.1f}.')