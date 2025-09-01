n1=int(input('Digite um número: '))
n2=int(input('Digite outro número: '))
n3=int(input('Digite mais um número: '))
#Verificando qual numero é menor
menor=n1
if n2<n1 and n2<n3:
    menor= n2
if n3<n1 and n3<n2:
    menor= n3
maior=n1
if n2>n1 and n2>n3:
    maior=n2
if n3>n1 and n3>n2:
    maior=n3
print('O maior número é {}.'.format(maior))
print('E o menor número é {}.'.format(menor))
#Nao era tao dificil, era so pensar melhor na logica e essa resolução
#acima é a versão mais simplificada.