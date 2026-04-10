from Pacote_Algoritmos.algoritmos import biseccao, newton, secante, gauss_seidel
from sympy import symbols, diff, lambdify, sqrt, acos

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
print(newton(f, df, h0, 1e-10))
print(secante(f, h00, h1, 1e-10))



matrix_A = [
    [4, 1, 2],
    [-1, 4, 3],
    [3, -7, 5]
]

b = [8, 1, 10]

print(gauss_seidel(matrix_A, b, 3, 10e-10, 150))

