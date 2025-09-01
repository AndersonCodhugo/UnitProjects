from datetime import date
from time import sleep

print('\033[34mBem-vindo ao sistema da Confederação Nacional de Natação.\033[m')
sleep(1)
nasc=int(input('Atleta digite seu ano de nascimento por favor: '))
ano = date.today().year
idade = ano - nasc
if idade <= 9:
    print('Sua categoria com a idade de {} anos é \033[36mMIRIM.'.format(idade))
elif idade <= 14:
    print('Sua categoria com a idade de {} anos é \033[36mINFANTIL.'.format(idade))
elif idade <= 19:
    print('Sua categoria com a idade de {} anos é \033[36mJUNIOR.'.format(idade))
elif idade <= 20:
    print('Sua categoria com a idade de {} anos é \033[36mSÊNIOR.'.format(idade))
else:
    print('Sua categoria com a idade de {} anos é \033[36mMASTER.'.format(idade))
