from math import radians,sin,cos,tan
angulo = float(input('Digite um ângulo: '))
rad = radians(angulo)
seno= sin(rad)
cosseno=cos(rad)
tangente=tan(rad)
print('Seu seno vale:{:.1f}'.format(seno))
print('Seu cosseno vale:{:.1f}'.format(cosseno))
print('Sua tangente vale:{:.1f}'.format(tangente))
#retirei o import math e reduzi para apenas as variaveis que usei e por isso retirei
#a referência .math em todos
