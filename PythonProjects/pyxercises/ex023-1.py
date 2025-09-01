n=int(input('Escreva um número com 4 digitos: '))
print('Fazendo ánalise do número {}'.format(n))
u= n//1%10
d= n//10%10
c= n//100%10
m=n//1000%10
print('Unidade:{}'.format(u))
print('Dezena: {}'.format(d))
print('Centena:{}'.format(c))
print('Milhar: {}'.format(m))
#Melhor resolução, que na verdade é a resolução correta.