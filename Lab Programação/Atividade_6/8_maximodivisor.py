def mdc(a, b):
    if b == 0:
        return a
    return mdc(b, a % b)

num1 = int(input('Digite o primeiro número para o cálculo do MDC: '))
num2 = int(input('Digite o segundo número para o cálculo do MDC: '))

print(mdc(num1, num2))