n = int(input('Digite um número: '))
tot= 0
for c in range(1, n + 1):
    if n % c == 0:
        tot += 1
if tot == 2:
    print('Seu número só é divisível por 1 e por ele mesmo, por isso ele é PRIMO. ')
else:
    print('Seu número possui mais de 2 divisores, por isso ele NÃO é um número PRIMO. ')
