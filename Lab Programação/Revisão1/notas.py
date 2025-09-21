def avaliar_aluno(nome, n1, n2, n3):
    media = (n1 + n2 + n3)/3

    if media >= 7:
        print(f'Aluno {nome} com média de {media:.1f}. APROVADO.')
    else:
        print(f'Aluno {nome} com média de {media:.1f}. REPROVADO')

for c in range(3):
    aluno = str(input("Nome do aluno: "))
    nota_1 = float(input("Digite a primeira nota: "))
    nota_2 = float(input("Digite a segundo nota: "))
    nota_3 = float(input("Digite a terceira nota: "))
    avaliar_aluno(aluno, nota_1, nota_2, nota_3)
