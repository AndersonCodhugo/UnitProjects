a1= int(input('Digite o primeiro termo da sua progressão aritmética: '))
r = int(input('Digite a razão dessa progressão: '))
for c in range (a1, a1+(11-1)*r, r): 
    print(c,end='-')
print('FIM DO PROGRAMA')
