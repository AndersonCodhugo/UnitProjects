score = {}
partidas = []
time = []
while True:
    score['Nome'] = str(input('Nome do Jogador: '))
    total = int(input(f'Quantas partidas {score['Nome']} jogou: '))
    partidas.clear()
    for g in range(1, total + 1):
        partidas.append(int(input(f'Quantos gols na partida {g}: ')))
    score['Gols'] = partidas[:]
    score['Total'] = sum(partidas)
    time.append(score.copy())
    while True:
        pergunta = str(input('Quer continuar[S/N]? ')).upper()[0]
        if pergunta in 'SN':
            break
        print('ERRO! Digite apenas S ou N.')
    if pergunta == 'N':
        break
print('cod', end = '')
for i in score.keys():
    print(f'{i:<15}', end ='')
print()
print('-' * 35)
for k, v in enumerate(time):
    print(f'{k:>3}', end='')
    for d in v.values():
        print(f'{str(d):<15}', end='')
    print()
while True:
    busca = int(input('Mostrar dados de qual jogador[999 para encerrar]? '))
    if busca == 999:
        break
    if busca >= len(time):
        print(f'ERRO. Não existe nenhum jogador correspondente ao cod {busca}')
    else:
        print(f'LEVANTAMENTO DO JOGADOR {time[busca]['Nome']}: ')
        for i, g in enumerate(time[busca]['Gols']):
            print(f'    No jogo {i+1} fez {g} gols.')
    print()
print('FIM DO PROGRAMA')
