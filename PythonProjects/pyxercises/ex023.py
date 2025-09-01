num=int(input('Digite um número de até 4 digitos: '))
print('''Seu número é {} e tem por definição 
     \nmilhar: {} 
     \ncentena:{} 
     \ndezena: {} 
     \nunidade:{}'''
     .format(num,num[0],num[1],num[2],num[3]))
