notas = [7.5, 8.0, 6.5, 9.0, 7.0]

print('Lista de notas:',notas)
soma= sum(notas)
print(f'Média das notas: {soma/len(notas)}')
print('Maior nota:', max(notas))
print('Menor nota:', min(notas))
print(f'Média aceita: > 7 | Aluno aprovado com média {soma/len(notas)}.')