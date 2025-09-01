n1=float(input('Digite sua nota de Matemática: '))
n2=float(input('Digite sua nota de Português: '))
m= (n1+n2)/2
print('A sua média foi de {:.1f}'.format(m))
if m >=6.0:
    print('Sua média foi ótima. Parabés CDF.')
else:
    print('Sua média foi horrível. Burro.')
    