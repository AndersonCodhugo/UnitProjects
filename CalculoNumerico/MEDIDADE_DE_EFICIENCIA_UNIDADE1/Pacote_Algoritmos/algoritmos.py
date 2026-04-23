def biseccao(f, xa, xb, precisao):
    print("---MÉTODO BISECÇÃO---")
    numero_de_iteracoes = 0

    if f(xa) * f(xb) > 0:
        return None
    
    while True:
        numero_de_iteracoes += 1

        xm = (xa + xb) / 2

        if abs (f(xm)) < precisao:
            return f"Número de iterações: {numero_de_iteracoes}, Valor final: {xm}"
        

        if f(xa) * f(xm) < 0:
            xb = xm
            print(f"Iteração: {xb}")
        else:
            xa = xm
            print(f"Iteração: {xa}")

def newton(f, df, x0, precisao):
    print("---MÉTODO NEWTON---")
    numero_de_iteracoes = 0

    if abs(f(x0)) < precisao:
        return x0
    
    
    xi = x0
    
    while True:
        numero_de_iteracoes += 1

        proximo_x = xi - (f(xi) / df(xi))

        if abs(f(proximo_x)) < precisao or abs(proximo_x - xi) < precisao:
            return f"Número de iterações: {numero_de_iteracoes}, Valor final: {proximo_x}"
        else:
            xi = proximo_x
            print(f"{numero_de_iteracoes}° Iteração: {xi}")

def secante(f, xi1, xi, precisao):
    print("---MÉTODO SECANTE---")
    numero_de_iteracoes = 0
    
    if abs(f(xi1)) < precisao:
        return f"MÉTODO SECANTE - Número de iterações: {numero_de_iteracoes}, {xi1}"
    if abs(f(xi)) < precisao:
        return f"MÉTODO SECANTE - Número de iterações: {numero_de_iteracoes}, {xi}"
    
    while True:
        numero_de_iteracoes += 1

        proximo_x = xi - (f(xi) * (xi - xi1)) / (f(xi) - f(xi1))

        if abs(f(proximo_x)) < precisao:
            return f"Número de iterações: {numero_de_iteracoes}, Valor final: {proximo_x}"
        else:
            xi1 = xi
            xi = proximo_x
            print(f"Iteração: {xi}")
        
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

def gauss_jacobi(A, b, n, precisao, max_iteracoes=50):

    x = [0.0] * n
    
    for k in range(max_iteracoes):
        x_antigo = list(x)
        
        for i in range(n):
            soma = 0
            for j in range(n):
                if j != i:
                    
                    soma += A[i][j] * x_antigo[j]
            
            x[i] = (b[i] - soma) / A[i][i]

        erros = [abs(x[i] - x_antigo[i]) for i in range(n)]
        erro_maximo = max(erros)
        
        if erro_maximo <= precisao:
            return f"MÉTODO GAUSS-JACOBI - Iterações: {k+1}, Resultado: {x}"
            
    return f"Atingiu o limite de iterações sem alcançar a precisão. Resultado parcial: {x}"
