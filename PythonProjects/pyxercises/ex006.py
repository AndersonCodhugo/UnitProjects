n=int(input('Por favor, digite um número de sua preferência '))
do=n*2
tri=n*3
ra=n**(1/2)
print('O seu número {}\nDobrado vale {}\nTriplicado vale {}\nSua raiz quadrada possui {:.3f} como valor'
      .format(n,do,tri,ra))
#Dentro do .format é possivel usar a variavel principal "n" e colocar com as operações.
#Por exemplo (n*2) , (n*3) e (n**(1/2))
#No caso especifico da potênciação existe a alternativa [pow(n, (1/2))] no pow 1° é a base e 2° o expoente.
