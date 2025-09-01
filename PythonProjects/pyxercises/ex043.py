print('BEM VINDO. Vamos calcular seu IMC(Indíce de Massa Corporal).')
peso=float(input('Qual o seu peso atual em quilos? '))
altura=float(input('Qual a sua altura atual em metros? '))
imc= peso/(altura**2)
if imc < 18.5:
    print('Você está ABAIXO DO PESO com um IMC de {:.1f}. Se alimente melhor.'.format(imc))
elif imc >= 18.5 and imc < 25:
    print('Você está no PESO IDEAL com um IMC de {:.1f}. Parabéns, continue assim.'.format(imc))
elif imc >= 25 and imc < 30:
    print('Você está com SOBREPESO com um IMC de {:.1f}. Faça uma dieta.'.format(imc))
elif imc >= 30 and imc < 40:
    print('Você está com OBESIDADE com um IMC de {:.1f}. Procure um nutricionista.'.format(imc))
else:
    print('Você está com OBESIDADE MÓRBIDA com um IMC de {:.1f}. Procure um médico imediatamente.'.format(imc))
