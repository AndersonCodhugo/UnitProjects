# QUESTÃO 3

produtos = []
quantidade = []

for c in range(1, 50):
    prod = str(input(f'{c}° produto: '))
    qtd = int(input('Quantidade: '))
    produtos.append(prod)
    quantidade.append(qtd)
    
    pergunta = str(input('Deseja continuar? [S/N]')).upper()[0]
    if pergunta == 'N':
        break

print('-'*30)
for i in range(0, len(produtos)):
    print(f' {i + 1} - {produtos[i]}')
print('-'*30)

item = int(input(f'Qual item gostaria de consultar [1 - {len(produtos)}]: '))

if quantidade[item - 1] <= 5:
    print(f'{produtos[item - 1]} possui {quantidade[item - 1]} unidades e está com estoque baixo. ')
else:
    print(f'{produtos[item - 1]} possui {quantidade[item - 1]} unidades.')

