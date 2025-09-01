score = {}
partidas = []
score['Nome'] = str(input('Nome do Jogador: '))
total = int(input(f'Quantas partidas {score['Nome']} jogou: '))
for g in range(1, total + 1):
    partidas.append(int(input(f'Quantos gols na partida {g}: ')))
score['Gols'] = partidas[:]
score['Total'] = sum(partidas)

print(score)
for i, k in score.items():
    print(f'O campo {i} tem o valor {k}.')

print(f'O jogador {score['Nome']} jogou {total} partidas.')
for p in range(1, total + 1):
    print(f'=> Na partida {p}, fez {partidas[p - 1]} gols.')
print(f"Foram um total de {score['Total']} gols.")
