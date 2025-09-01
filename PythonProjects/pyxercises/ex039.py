from datetime import date
print('BEM-VINDO AO PROGRAMA NACIONAL DE \033[0;32mALISTAMENTO\033[m \033[0;33mMILITAR\033[m')
nome = str(input('Digite seu nome: '))
idade = int(input('Em que ano você nasceu {}? '.format(nome)))
ano = date.today().year
tempo = ano-idade
if tempo == 18:
    print('Chegou a hora de se apresentar na junta militar e cumprir seu dever com o seu país.')
elif tempo < 18:
    print('Ainda não é a hora de se apresentar mas fique ligado pois faltam {} anos para o seu momento.'.format(tempo*(-1)+18))
else:
    print('Você ultrapassou {} anos do tempo adequado. Apresente-se imediatamente na junta militar mais próxima.'.format(tempo-18))
