pessoa= {}
galera = []
mulheres = []
soma = média = 0
cont = 1
while True:
    pessoa.clear()
    pessoa['Nome'] = str(input('Nome da pessoa: '))
    while True:
        pessoa['Sexo'] = str(input('Sexo[M/F]: ')).upper()[0]
        if pessoa['Sexo'] in 'MF':
            break
        print('ERRO! Comando inválido, digite apenas M ou F.')
    pessoa['Idade'] = int(input('Idade: '))
    soma += pessoa['Idade']
    galera.append(pessoa.copy())
    while True:
        pergunta = str(input('Deseja adicionar mais[S/N]?')).upper()[0]
        if pergunta in 'SN':
            break
        print('ERRO! Digite apenas S ou N.')
    if pergunta == 'N':
        break
print(f'O grupo possui {len(galera)} pessoas')
média = soma / len(galera)
print(f'O grupo possui uma média de idade de {média:5.2f} anos.')
print('As mulheres cadastradas foram ', end='')
for p in galera:
    if p ['Sexo'] == 'F':
        print(f'{p['Nome']} ', end='')
print()
print('As pessoas com idade acima da média são: ', end='')
for p in galera:
    if p['Idade'] >= média:
        print('     ')
        for k, v in p.items():
            print(f'{k} =  {v}; ', end='')
        print()
print('FIM')
