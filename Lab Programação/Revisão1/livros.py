lista_livros = {}

for l in range(3):
    titulo = str(input('Insira um título de livro: ')).upper()
    autor = str(input('Insira o autor desse livro: ')).upper()
    lista_livros[titulo] = autor

pergunta = str(input('Digite um titulo de livro para ser pesquisado: ')).upper()

if pergunta in lista_livros:
    print('O Autor(a) desse livro é : ', lista_livros[pergunta])
else:
    print('Livro não encontrado!')
