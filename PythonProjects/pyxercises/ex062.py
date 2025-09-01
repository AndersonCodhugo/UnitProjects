a1 = int(input('Digite o primeiro termo de uma PA: '))
r = int(input('Digite a razão dessa PA: '))
termo = a1
cont = 1
total = 0
mais = 10
while mais != 0:
    total += mais
    while cont <= total:
        print('{} -> '.format(termo),end='')
        termo += r
        cont += 1
    print('?')
    mais = int(input('Quantos termos a mais você gostaria de ver? '))
print('Fim do Programa')
