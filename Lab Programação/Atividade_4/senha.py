# QUESTÃO 6

senha = 1234

for c in range(0, 3):
    login = int(input('Digite a senha: '))

    if login == senha:
        print('Acesso permitido!')
        break
    else:
        print('Senha incorreta')
        continue
else:
    print('Acesso bloqueado!')