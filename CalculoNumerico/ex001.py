from Pacote_Algoritmos.algoritmos import biseccao, newton, secante, gauss_seidel
from sympy import symbols, diff, lambdify, sqrt, acos, cos, exp
import matplotlib.pyplot as plt
import math


#APS
'''
r = 2
L = 5
V = 8
def f(h):
    return (r**2 * acos((r - h)/r) 
            - (r - h) * sqrt(2*r*h - h**2)) * L - V

h = symbols('h')
derivada_simbolica = diff((r**2*acos((r-h)/r) - (r-h)*sqrt(2*r*h - h**2))*L - V, h)
df = lambdify(h, derivada_simbolica, "math")

a = 0.0
b = 2.0

h0 = 1.0

h00 = 0.5
h1 = 1.5

print(biseccao(f, a, b, 1e-10))
print("")
print(newton(f, df, h0, 1e-10))
print("")
print(secante(f, h00, h1, 1e-10))
print("")



matrix_A = [
    [4, 1, 2],
    [-1, 4, 3],
    [3, -7, 5]
]

b = [8, 1, 10]

print(gauss_seidel(matrix_A, b, 3, 10e-10, 150))
'''

#EXERCICIO

#01
'''
P = 35000
A = 8500
n = 7

def f(i):
    return P*(i*(1 + i)**n) / ((1 + i)**n - 1) - A

i_simbo = symbols('i')
derivada_simbolica_2 = diff(P*(i_simbo*(1 + i_simbo)**n) / ((1 + i_simbo)**n - 1) - A, i_simbo)
df_2 = lambdify(i_simbo, derivada_simbolica_2, "math")

a = -1.1
b = -0.9

h0 = -0.9

h00 = -1.15
h1 = -0.8

print(biseccao(f, a, b, 1e-10))
print("")
print(newton(f, df_2, h0, 1e-10))
print("")
print(secante(f, h00, h1, 1e-10))
print("")
'''

#02

'''
T0 = 300
T = 1000
u0 = 1360
q = 1.7e-19
ni = 6.21e9
p = 6.5e6

u = u0 * (T/T0)** -2.42

def f(N):

    n = 0.5 * (N + sqrt(N**2 + 4 * ni**2))

    return 1 / (q * n * u) - p

N_sym = symbols('N')

n_sym = 0.5 * (N_sym + sqrt(N_sym**2 + 4 * ni**2))
f_sym = 1 / (q * n_sym * u) - p

derivada_simbolica_3 = diff(f_sym, N_sym)

df_3 = lambdify(N_sym, derivada_simbolica_3, "math")


print(biseccao(f, 10e8, 10e9, 1e-10))
print("")
print(newton(f, df_3, 1e10, 1e-10))
print("")
print(secante(f, 1e10, 1.5e10, 1e-10))
print("")
'''

'''
Ce = 1.1

def f(T):

    return (0.99403 + 1.671e-4*T + 9.7215e-8*T**2 - 9.5838e-11*T**3 + 1.9520e-14*T**4) - Ce

T_simbo = symbols('T')

expr_simbolica = (0.99403 + 1.671e-4*T_simbo + 9.7215e-8*T_simbo**2 - 9.5838e-11*T_simbo**3 + 1.9520e-14*T_simbo**4) - Ce

derivada_simbolica_4 = diff(expr_simbolica, T_simbo)

df_4 = lambdify(T_simbo, derivada_simbolica_4, "math")

a = -1200
b = -1100

h0 = -1150

h00 = -1150
h1 = -1120

print(biseccao(f, a, b, 1e-10))
print("")
print(newton(f, df_4, h0, 1e-10))
print("")
print(secante(f, h00, h1, 1e-10))
print("")
'''

'''
def f(x):
    
    return 4 + x * math.cos(x)

X_sym = symbols('x')

x_sym = 4 + X_sym * cos(X_sym)

derivada_simbolica_5 = diff(x_sym, X_sym)

df_5 = lambdify(X_sym, derivada_simbolica_5, "math")

print(newton(f, df_5, 10, 1e-5))
'''

#04
'''
g = 9.8
m = 110.0
t = 7.0
v_target = 40.0

def f(c):
    return ((g * m) / c) * (1 - math.exp(-t * (c / m))) - v_target


a = 10.0
b = 20.0


print(biseccao(f, a, b, 1e-6))
print("")
'''