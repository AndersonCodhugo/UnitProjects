frase=str(input('Digite uma frase: ')).upper().strip()
print('Sua frase tem {} letras "A".'.format(frase.count('A')))
print('A letra "A" aparece a primeira vez na posição {}.'.format(frase.find('A')+1))
print('A letra "A" aparece a ultima vez na posição {}.'.format(frase.rfind('A')+1))
#adicionar o +1 para que a resposta seja um consenso comum de posição