from datetime import date
dados = {}
dados['Nome'] = str(input('Nome: '))
dados['Ano'] = int(input('Data de Nascimento: '))
ano = date.today().year
idade = ano - dados['Ano'] 
dados['CTPS'] = int(input('Número da Carteira[0 caso não haja]: '))
if dados['CTPS'] != 0:
    dados['Contratação'] = int(input('Ano de Contratação: '))
    dados['Salário'] = float(input('Salário R$ '))
    dados['Aposentadoria'] = (dados['Contratação'] + 35) - dados['Ano']
for i, v in dados.items():
    print(f'{i} tem o valor {v} ')
