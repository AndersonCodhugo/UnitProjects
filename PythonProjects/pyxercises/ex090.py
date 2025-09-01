aluno = {}
aluno['nome'] = str(input('Nome do Aluno: '))
aluno['média'] = float(input(f'Média de {aluno['nome']}: '))
if aluno['média'] >= 7:
    aluno['situação'] = 'Aprovado'
elif aluno['média'] < 7 and aluno['média'] >= 5:
    aluno['situação'] = 'Recuperação'
else:
   aluno['situação'] = 'Reprovado'
for k, v in aluno.items():
    print(f'{k} é igual a {v}.')
