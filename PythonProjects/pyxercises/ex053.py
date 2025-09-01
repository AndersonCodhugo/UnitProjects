palavra = str(input('Digite algo e descubra se é um palíndromo: ' )).strip().upper()
separação = palavra.split()
junto = ''.join(separação)
contrário = ''
for letras in range (len(junto) -1, -1, -1):
    contrário += junto[letras]
print('O contrário de {} é {}, portanto:'.format(junto, contrário))
if contrário == junto:
    print('Gotcha! Isso que você escreveu é um palíndromo.')
else:
    print('Isso que você escreveu não é um palídromo.')

#primeiro leu a frase, com o strip eliminou os espaços e com upper colocou a frase toda maiuscula
#com o split separou tudo em uma lista
#com o join juntou tudo em uma palavra inteiro só
#o contrário vazio é só pra ditar a variavel antes
#com o 'for' inverteu a palavra
# existe outra maneira mais fácil de inverter as palavras, mas não usei por não fazer parte da aula.