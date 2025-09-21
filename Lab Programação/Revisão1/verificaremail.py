email = str(input('Digite um email: '))

if '@' and '.com' in email:
    print('E-mail válido!')
else:
    print('E-mail inválido!')