d=float(input('Qual a distância da sua viagem: '))
print('Analisando...')
v1=d*0.50
v2=d*0.45
if d <= 200:
    print('O preço da sua viagem de {}Km será de {:.2f}R$'.format(d,v1))
else:
    print('O preço da sua viagem de {}Km será de {:.2f}R$'.format(d,v2))