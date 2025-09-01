soma = 0
media = 0
maior = 0
nomeold = ''
mulher20 = 0
for dados in range (1,5):
    name=str(input('Digite o nome da {}ª pessoa: '.format(dados))).strip()
    age=int(input('Digite a idade da {}ª pessoa: '.format(dados)))
    sex=str(input('Qual o sexo [M/F]: '.format(dados))).strip()
    soma += age
    if dados == 1 and sex in 'Mm':
         maior = age
         nomeold = name
    if sex in 'Mm' and age > maior:
         maior = age
         nomeold = name
    if sex in 'Ff' and age < 20:
         mulher20 += 1
media = soma/4
print('A média de idade de todas as 4 pessoas é de {:.1f} anos.'.format(media))
print('O homem mais velho se chama {} e tem {} anos de idade.'.format(nomeold, maior))
print('Existem entre essas pessoas {} mulheres com menos de 20 anos.'.format(mulher20))
#praticar mais exercicios desse estilo