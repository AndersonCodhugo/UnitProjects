#Criei um pacote com todas as funções para serem resolvidos os problemas a partes esse import abaixo faz a chamada dele

from Pacote_Algoritmos.algoritmos import newton
from sympy import symbols, diff, lambdify, cos
import math

#Medida de Eficiência

def f(x):
    
    return 4 + x * math.cos(x)

X_sym = symbols('x')

x_sym = 4 + X_sym * cos(X_sym)

derivada_simbolica_5 = diff(x_sym, X_sym)

df_5 = lambdify(X_sym, derivada_simbolica_5, "math")

print('\033[0;33;41mPrimeira Raiz:\033[m')
print(newton(f, df_5, 8, 1e-5))
print("")
print('\033[0;33;41mSegunda Raiz:\033[m')
print(newton(f, df_5, 10, 1e-5))
