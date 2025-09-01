# QUESTÃO 1

turma = []
soma = 0
maiores = 0

for c in range (5):
    nota = float(input(f'Digite a nota do {c + 1}° aluno: '))
    turma.append(nota)
    soma = soma + nota

media = soma / len(turma)
    
for i in range(0, len(turma)):
    if turma[i] > media:
        maiores = maiores + 1
        

print(f'A turma tem uma média de {media:.2f}')
print(f'{maiores} alunos tiveram notas acima da média.')
print(f'A maior nota foi {max(turma)} e a menor foi {min(turma)}')
