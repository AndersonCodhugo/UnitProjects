nome = str(input('Digite seu nome completo: '))
nome=nome.strip()
nomeone=nome.split()
print('Maiúsculo: {}'.format(nome.upper()))
print('Minúsculo: {}'.format(nome.lower()))
print('Seu nome tem {} letras'.format(len(nome)-nome.count(' ')))
print('Seu primeiro nome tem {} letras'.format(nome.find(' ')))
#é possivel colocar o "-" para retirar algo por ex: todos os 
#espaços fazendo a contagem apenas das letras no nome. -variavel(' ')
#adicionando espaços vazios ou o que quiser remover do print final
#segundo solução para o quarto print:
#print('Seu primeiro nome é {} e ele tem {} letras.'.format(nomeone[0],len(nomeone[0])))