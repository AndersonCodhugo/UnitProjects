s1=float(input('Digite um comprimento de reta: '))
s2=float(input('Digite outro comprimento de reta: '))
s3=float(input('Digite mais um comprimento de reta: '))
if s1 < s2 + s3 and s2 < s1 + s3 and s3 < s1 +s2:
    if s1 == s2 == s3:
        print('Sues segmentos podem formar um triângulo ISÓCELES.')
    elif s1 == s2 or s2 == s3 or s1 == s3:
        print('Seus segmentos podem formar um triângulo EQUILÁTERO.')
    else:
        print('Seus segmentos podem formar um triângulo ESCALENO.')
else:
    print('Seus segmentos não podem formar um triângulo regular.')

    #testando os aninhamentos dentro de aninhamentos
