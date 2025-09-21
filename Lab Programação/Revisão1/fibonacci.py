def fibonacci(numero):
    if numero == 0 or numero == 1:
        return numero
    else:
        return (fibonacci(numero - 1) + fibonacci(numero - 2))
    
valor = int(input('Digite um valor para a ver sequência de Fibonacci: '))

for c in range(1, valor+1):
    print(fibonacci(c),end=' ')
