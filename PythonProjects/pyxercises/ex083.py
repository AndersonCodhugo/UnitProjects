exp = str(input('Digite uma expressão matemática: '))
check = []
for simb in exp:
    if simb == '(':
        check.append('(') #adiciona um parentese aberto
    elif simb == ')':
        if len(check) > 0: #se achar um parentese aberto e um fechado ele elimina ambos
            check.pop()
        else:
            check.append(')')#caso não encontre ele permanece com um aberto, logo errado
if len(check) == 0:#se a pilha final de parenteses que vao se eliminando for igual a 0 está correto
    print(f'Sua expressão {exp} está correta.')
else:#se ouver algum parentese sozinho o saldo sera maior que 0, logo, errado
    print(f'Sua expressão {exp} está incorreta')
