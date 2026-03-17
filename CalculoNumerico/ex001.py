from Pacote_Algoritmos.algoritmos import biseccao, newton

f = lambda x: x**2 - 4

df = lambda x: 2 * x

print(newton(f, df, 3, 0.00001))
