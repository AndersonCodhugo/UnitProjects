def biseccao(f, xa, xb, precisao):
    numero_de_iteracoes = 0

    if f(xa) * f(xb) > 0:
        return None
    
    while True:
        numero_de_iteracoes += 1

        xm = (xa + xb) / 2

        if abs (f(xm)) < precisao:
            return f"MÉTODO BISECÇÃO - Número de iterações: {numero_de_iteracoes}, {xm}"
        
        if f(xa) * f(xm) < 0:
            xb = xm
        else:
            xa = xm

def newton(f, df, x0, precisao):
    numero_de_iteracoes = 0

    if abs(f(x0)) < precisao:
        return x0
    
    
    xi = x0
    
    while True:
        numero_de_iteracoes += 1

        proximo_x = xi - (f(xi) / df(xi))

        if abs(f(proximo_x)) < precisao or abs(f(proximo_x - xi)) < precisao:
            return f"MÉTODO NEWTON - Número de iterações: {numero_de_iteracoes}, {proximo_x}"
        else:
            xi = proximo_x

def secante(f, xi1, xi, precisao):
    numero_de_iteracoes = 0
    
    if abs(f(xi1)) < precisao:
        return f"MÉTODO SECANTE - Número de iterações: {numero_de_iteracoes}, {xi1}"
    if abs(f(xi)) < precisao:
        return f"MÉTODO SECANTE - Número de iterações: {numero_de_iteracoes}, {xi}"
    
    while True:
        numero_de_iteracoes += 1

        proximo_x = xi - (f(xi) * (xi - xi1)) / (f(xi) - f(xi1))

        if abs(f(proximo_x)) < precisao:
            return f"MÉTODO SECANTE - Número de iterações: {numero_de_iteracoes}, {proximo_x}"
        else:
            xi1 = xi
            xi = proximo_x
        
def gauss_seidel(A, b, n, precisao, max_iteracoes=50):

    x = [0.0] * n
    
    for k in range(max_iteracoes):
        x_antigo = list(x)
        
        for i in range(n):
            soma = 0
            for j in range(n):
                if j != i:
                    soma += A[i][j] * x[j]
            
            x[i] = (b[i] - soma) / A[i][i]

        erros = [abs(x[i] - x_antigo[i]) for i in range(n)]
        erro_maximo = max(erros)
        
        if erro_maximo <= precisao:
            return f"MÉTODO GAUSS-SEIDEL - Iterações: {k+1}, Resultado: {x}"
            
    return f"Atingiu o limite de iterações sem alcançar a precisão. Resultado parcial: {x}"