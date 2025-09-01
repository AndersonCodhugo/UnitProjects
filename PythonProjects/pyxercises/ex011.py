a=float(input('Qual a altura(m) da parede que deseja pintar '))
l=float(input('Qual a largura(m) da parede que deseja pintar '))
la=a*l
li=la/2
print('A área da sua parede de dimensões {:.2f}x{:.2f} possui {:.2f}m² de área.'.format(a,l,la))
print('Para pintar sua parede serão necessários {:.3f} litros de tinta.'.format(li))