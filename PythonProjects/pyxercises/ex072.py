numeros = ('zero','um','dois','três','quatro','cinco','seis','sete','oito','nove','dez','onze','doze','treze','quatorze','quinze','dezesseis','dezessete','dezoito','dezenove','vinte')
pergunta = int(input('Digite um número de 0 a 20: '))
while pergunta < 0 or pergunta > 20:
        pergunta = int(input('Resposta Inválida! Digite um número de 0 a 20: '))
print(f'O número que você digitou foi {numeros[pergunta]}')
print('FIM DO PROGRAMA')