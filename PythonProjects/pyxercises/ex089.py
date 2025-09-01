ficha = []
valor = 0
while True:
    nome = str(input('Nome do Aluno(a): '))
    if nome not in '':
        valor += 1
    nota1 = float(input('Primeira nota: '))
    nota2 = float(input('Segunda nota: '))
    média = (nota1 + nota2)/2
    ficha.append([nome, [nota1, nota2], média])
    ask = str(input('Deseja continuar[S/N]? '))
    if ask not in 'Ss':
        break
print(f'{'N°.':<4}{'NOME':<10}{'MÉDIA':>8}')
for i, a in enumerate(ficha):
    print(f'{i:<4}{a[0]:<10}{a[2]:>8.1f}')
while True:
    opc = int(input('Deseja ver as notas de qual aluno(999 para encerrar)?'))
    if opc <=len(ficha) -1:
        print(f'As notas do aluno {ficha[opc][0]} são: {ficha[opc][1]}.')
    if opc == 999:
        print('PROGRAMA FINALIZADO')
        break
