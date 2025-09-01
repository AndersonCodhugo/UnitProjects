s1=float(input('Digite um comprimento de reta: '))
s2=float(input('Digite outro comprimento de reta: '))
s3=float(input('Digite mais um comprimento de reta: '))
if s1 < s2 + s3 and s2 < s1 + s3 and s3 < s1 +s2 and s1== s2 == s3:
    print('Seus segmentos de reta conseguem formar um triângulo equilátero.')
elif s1 < s2 + s3 and s2 < s1 + s3 and s3 < s1 +s2 and s1 == s2 or s2 == s3 or s3 == s1:
    print('Seus segmentos de reta conseguem formar um triângulo isóceles.')
elif s1 < s2 + s3 and s2 < s1 + s3 and s3 < s1 +s2 and s1 != s2 != s3:
    print('Seus segmentos de reta conseguem formar um triângulo escaleno.')
else:
    print('Seus segmentos de reta não conseguem formar um triângulo.')
