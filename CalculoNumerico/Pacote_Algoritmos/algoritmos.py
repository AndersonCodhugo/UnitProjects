def biseccao(f, xa, xb, precisao):
    numero_de_iteracoes = 0
    if f(xa) * f(xb) > 0:
        return None
    
    while True:
        numero_de_iteracoes += 1

        xm = (xa + xb) / 2

        if abs (f(xm)) < precisao:
            return f"Número de iterações: {numero_de_iteracoes}, {xm}"
        
        if f(xa) * f(xm) < 0:
            xb = xm
        else:
            xa = xm

def newton(f, df, x0, precisao):
    if abs(f(x0)) < precisao:
        return x0
    
    numero_de_iteracoes = 0
    
    xi = x0
    
    while True:
        numero_de_iteracoes += 1

        proximo_x = xi - (f(xi) / df(xi))

        if abs(f(proximo_x)) < precisao or abs(f(proximo_x - xi)) < precisao:
            return f"Número de iterações: {numero_de_iteracoes}, {proximo_x}"
        else:
            xi = proximo_x


        