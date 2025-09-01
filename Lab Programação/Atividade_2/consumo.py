consumo = int(input('Digite o seu consumo de energia em KWh: '))

if consumo <= 100:
    print('Baixo Consumo')
elif consumo > 100 and consumo <= 300:
    print('Consumo Médio')
else:
    print('Alto Consumo')