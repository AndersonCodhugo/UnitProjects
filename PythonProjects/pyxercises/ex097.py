def escreva(lst):
    pos = 0
    while pos < len(lst):
        tam = len(palavras[pos]) + 4
        print('~'*tam)
        print(f'  {palavras[pos]}')
        print('~'*tam)
        pos += 1


palavras = []
while True:
    pergunta = str(input('Digite uma palavra: '))
    palavras.append(pergunta)
    duvida = str(input('Deseja continuar[S/N]? ')).upper()[0]
    if duvida not in 'S':
        break
escreva(palavras)
