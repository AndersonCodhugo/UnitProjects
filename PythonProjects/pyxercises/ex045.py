from random import choice
from time import sleep
print('-°-'*10)
print('\033[4;36mBEM VINDO AO JOKENPO DO PYTHON!!\033[m')
print('-°-'*10)
sleep(2)
print('''DIGITE
      \033[42m1\033[m PARA PEDRA
      \033[42m2\033[m PARA PAPEL 
      \033[42m3\033[m PARA TESOURA''')
print(' ')
escolhaj = int(input('Qual a sua escolha? '))
pedra = 1
e1 = pedra
papel = 2
e2 = papel
tesoura = 3
e3 = tesoura
escolhas = [pedra, papel, tesoura]
mach = choice(escolhas)
sleep(2)
if escolhaj == 1 and mach == 1:
     print('\033[47mVocê escolheu pedra e eu pedra então essa rodada deu EMPATE.\033[m')
elif escolhaj == 1 and mach == 2:
     print('\033[41mHAHA. Eu escolhi papel e tu pedra então te VENCI.\033[m')
elif escolhaj == 1 and mach == 3:
     print('\033[44mParabéns, escolhi tesoura e tu pedra então VOCÊ me VENCEU..\033[m')
elif escolhaj == 2 and mach == 1:
     print('\033[44mParabéns, escolhi pedra e tu papel então VOCÊ me VENCEU.\033[m')
elif escolhaj == 2 and mach == 2:
     print('\033[47mVocê escolheu papel e eu papel então essa rodada deu EMPATE.\033[m')
elif escolhaj == 2 and mach == 3:
     print('\033[41mHAHA. Eu escolhi tesoura e tu papel então te VENCI.\033[m')
elif escolhaj == 3 and mach == 1:
     print('\033[41mHAHA. Eu escolhi pedra e tu tesoura então te VENCI.\033[m')
elif escolhaj == 3 and mach == 2:
     print('\033[44mParabéns, escolhi papel e tu tesoura então VOCÊ me VENCEU.\033[m')
elif escolhaj == 3 and mach == 3:
     print('\033[47mVocê escolheu tesoura e eu tesoura então essa rodada deu EMPATE.\033[m')
print(' ')
sleep(1)
print('§'*12)
print('\033[45mFIM DO GAME.\033[m')
print('§'*12)
