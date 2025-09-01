s=float(input('Qual o seu salário? '))
if s >= 1250:
    print('Seu novo sálario com reajuste de 10% será de {:.2f}R$'.format(s*1.10))
else:
    print('Seu novo salário com reajuste de 15% será de {:.2f}R$'.format(s*1.15))