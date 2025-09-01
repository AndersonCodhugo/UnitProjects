pergunta = ' '
while pergunta not in 'S':
    pergunta = str(input('Olá, você deseja ver a tabela do Campeonato Brasileiro Série A?[S/N]')).strip().upper()[0]
brasileirao = ('Flamengo','Palmeiras','Botafogo','Fortaleza','São Paulo','Internacional','Corinthians','Bahia','Altlético - MG','Vasco','Vitória','Fluminense','Chapecoense','Críciuma','Santos','Sport','Grêmio','Cuiaba','Bragantino','Confiança')
oscinco = brasileirao[:5]
osquatro = brasileirao[16:21]
print('[TABELA DO BRASILEIRÃO 2035]')
print('<>'*30)
for c in range (0,20):
    print(brasileirao[c], c+1,'°')
print('<>'*30)
print(f'Os cinco primeiros colocados são {oscinco}')
print('<>'*30)
print(f'Os quatro ultimos colocados são {osquatro}')
print('<>'*30)
print(f'Os times do Campeonato em ordem alfabética são {sorted(brasileirao)}')
print('<>'*30)
print(f'O time da Chapecoense se encontra na {brasileirao.index('Chapecoense')+1}° posição.')