nome=str(input('Digite seu nome completo: ')).strip()
sep=nome.split()
print('Seu primeiro nome é: {}'.format(sep[0]))
print('Seu ultímo nome é: {}'.format(sep[len(sep)-1]))
#len para saber quantas posições e -1 para pegar o ultimo
