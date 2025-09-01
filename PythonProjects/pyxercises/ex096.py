def área(larg, comp):
    dms = larg * comp
    print(f'A área de um terreno {larg} x {comp} é de {dms}m²>')


print('Calculo de Terrenos')
print('-' *25)
l = float(input('Largura do terreno(m): '))
c = float(input('Comprimento do terreno(m): '))
área(l, c)
