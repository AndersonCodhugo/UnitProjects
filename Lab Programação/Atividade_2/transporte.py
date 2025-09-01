print('Bem Vindo! Vamos iniciar sua corrida escolhendo seu veículo.')
dist = float(input('Qual a distância que você irá percorrer?'))

if dist <= 5:
    print('Seu veículo será uma moto!')
elif dist > 5 and dist <= 20:
    print('Seu veículo será um carro!')
else:
    print('Seu veículo será uma Van!')