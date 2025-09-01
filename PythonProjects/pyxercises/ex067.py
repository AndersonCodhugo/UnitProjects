print('''BEM-VINDO AO PROGRAMA DE TABUADA
-----------------------------------------
DE QUAL NÚMERO VOCÊ DESEJA VER A TABUADA?''')
while True:
    num = int(input('Digite aqui: '))
    if num <0:
        break
    for cont in range(1, 11):
        print(f'{num}', 'x' ,cont ,'=' ,num*cont)
    
print('PROGRAMA DE TABUADA ENCERRADO - OBRIGADO')