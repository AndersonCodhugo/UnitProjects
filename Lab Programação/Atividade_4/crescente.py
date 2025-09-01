# QUESTÃO 4

crescente = "sim"
ultimoValor = 0

while True:
    num = int(input("Digite o número: "))
   
    if num == 0:
        print(f"A ordem foi crescente? {crescente}")
        break
    
    if num < 1:
        print("Digite um número válido")
        continue
        
    if num <= ultimoValor:
        crescente = "não"
            
    ultimoValor = num