n1=float(input('Digite a sua nota da primeira avaliação: '))
n2=float(input('Digite a sua nota da segunda avaliação: '))
média=(n1+n2)/2
if média < 5.0:
    print('Infelizmente sua média de {:.1f} não foi suficiente e você está \033[0;31;40mREPROVADO\033[m.'.format(média))
elif média >= 5.0 and média <= 6.9:
    print('Com sua média de {:.1f} você está automáticamente em \033[0;33mRECUPERAÇÃO\033[m.'.format(média))
else:
    print('Parabéns, com sua média de {:.1f} você está \033[0;32mAPROVADO\033[m.'.format(média))
print('FIM.')