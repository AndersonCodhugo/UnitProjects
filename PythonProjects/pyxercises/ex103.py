def ficha(jog = '<desconhecido>', gol = 0):
    print(f'O jogador {jog} fez {gol} gol(s) no campeonato.')
jogador = str(input('Nome do Jogador: '))
gols = str(input('Quantidade de Gols: '))
if gols.isnumeric():
    gols = int(gols)
else:
    gols = 0
if jogador.strip() == '':
    ficha(gol = gols)
else:
    ficha(jogador, gols)
