n = (int(input('Digite um número: ')), int(input('Digite um número: ')), int(input('Digite um número: ')), int(input('Digite um número: ')))
print(f'Você digitou os valores {n}')
print(f'O número 9 aparece entre esses valores {n.count(9)} vezes.')
if 3 in n:
    print(f'O número 3 apareceu na posição {n.index(3)+1}.')
else:
    print(f'O número 3 não apareceu nenhuma vez')
print('Os valores pares digitados foram ', end='')
for num in n:
    if num % 2 == 0:
        print(num, end=' ') 
