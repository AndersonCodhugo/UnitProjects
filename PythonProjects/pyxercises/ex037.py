n=int(input('Digite um número: '))
print(''' Escolha a opção de conversão abaixo:   
(1) para Binário
(2) para Hexadecimal
(3) para Octal''')
opc=int(input('Qual você escolhe? '))
if opc == 1:
    print('O número {} em Bínario é igual a {}'.format(n, bin(n)[2:]))
elif opc == 2:
    print ('O número {} em Hexadecimal é igual a {}'.format(n,hex(n)[2:]))
elif opc == 3:
    print('O número {} em Octal é igual a {}'.format(n, oct(n)[2:]))
else:
    print('Opção inválida. Leia novamente as opções com atenção e tente novamente.')
#precisei ver a resolução para aprender