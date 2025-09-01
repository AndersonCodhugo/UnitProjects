print('--BEM VINDO AO CADASTRO DE PESSOAS--')
m = 0
f = 0
muiesoma = 0
somaall = 0
while True:
    sexo = ' '
    age = int(input('Idade: '))
    if age >= 18:
        somaall += 1
    while sexo not in 'MF':
        sexo = str(input('Sexo: [M/F]: ')).strip().upper()[0]
    if sexo == 'M':
        m += 1
    if sexo == 'F':
        f += 1
        if age >= 20:
            muiesoma += 1
    ask = str(input('Deseja continuar[S/N]? ')).strip().upper()[0]
    if ask == 'N':
        break
print(f'''
Você cadastrou:
{somaall} pessoas com mais de 18 anos de idade
{m} pessoas dos sexo masculino
{muiesoma} mulheres com mais de 20 anos de idade     ''')
print('FIM DO PROGRAMA')