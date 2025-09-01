nota = float(input('Qual a sua nota? '))

if nota >= 7:
    print('Aprovado!')
elif nota >= 4 and nota < 7:
    print('Recuperação!')
else:
    print('Reprovado!')