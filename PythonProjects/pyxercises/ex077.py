palavras = ('corno', 'falso', 'gol', 'futebol', 'messi', 'carro', 'cachorro', 'bonita','eletricidade')
for p in palavras:
    print(f'\nNa palavra {p.upper()} existem as vogais: ', end='')
    for letra in p:
        if letra.lower() in 'aeiou':
            print(letra.upper(),'', end='')