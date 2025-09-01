from math import hypot
co = float(input('Valor do cateto oposto: '))
ca = float(input('Valor do cateto adjacente: '))
hi = hypot(co,ca)
print('Seu triângulo retângulo tem hipotenusa de valor:{:.0f}'.format(hi))