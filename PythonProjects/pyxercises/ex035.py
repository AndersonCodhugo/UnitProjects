#Cada segmento deve ser menor que a soma do comprimento dos outros segmentos
s1=float(input('Digite um comprimento de reta: '))
s2=float(input('Digite outro comprimento de reta: '))
s3=float(input('Digite mais um comprimento de reta: '))
if s1 < s2 + s3 and s2 < s1 + s3 and s3 < s1 + s2:
    print('Seus segmentos podem formar um triângulo.')
else:
    print('Seus segmentos não podem formar um triângulo.')
    