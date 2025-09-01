print('LOGIN')
user = str(input('Usuário:'))
senha = int(input('Senha:'))

if user == 'admin' and senha == 1234:
    print('Login Bem Sucedido!')
else:
    print('Login ou senha incorretos!')
