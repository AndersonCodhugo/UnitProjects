def voto(ano):
    from datetime import date
    data = date.today().year
    idade = data - ano
    if idade < 16:
        return f'Com {idade} anos : VOTO PROIBIDO.'
    elif 16 <= idade < 18 or idade >= 65:
        return f'Com {idade} anos : VOTO FACULTATIVO.'
    else:
        return f'Com {idade} anos : VOTO OBRIGATÓRIO.'
    

nasc = int(input('Em que ano você nasceu? '))
print(voto(nasc))
