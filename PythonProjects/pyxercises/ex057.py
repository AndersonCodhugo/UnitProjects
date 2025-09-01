sexo = str(input('Digite seu sexo: ')).strip().upper()[0]
while sexo not in 'FfMm':
        sexo = str(input(('Comando inválido, tente novamente: ')))
print('''Sexo {} adicionado com sucesso a base de dados. \nFIM'''.format(sexo))
