import math
co=float(input('Digite o valor do cateto oposto: '))
ca=float(input('Digite o valor do cateto adjacente: '))
hip= math.sqrt(co**2 + ca**2)
print('Seu triângulo retangulo de c.o.{} e c.a.{} tem hipotenusa no valor de {:.2f}'.format(co,ca,hip))