progresso = float(input('Digite a porcentagem de progresso do projeto: '))
porcento = progresso / 100

if porcento < 0.3 :
    print('O projeto está no início!')
elif porcento >= 0.3 and porcento <= 0.7:
    print('O projeto está em andamento!')
elif porcento > 0.7 and porcento < 1:
    print('O projeto está quase concluído!')
else:
    print('Projeto Concluído!')
