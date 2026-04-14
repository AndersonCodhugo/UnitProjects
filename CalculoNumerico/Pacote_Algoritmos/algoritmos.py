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

        if abs(f(proximo_x)) < precisao or abs(f(proximo_x - xi)) < precisao:
            return f"Número de iterações: {numero_de_iteracoes}, Valor final: {proximo_x}"
        else:
            xi = proximo_x
            print(f"Iteração: {xi}")

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



















'''

--------------------------------------------------------------------------------
1. TEORIA DOS ZEROS DE FUNÇÕES (RAÍZES) - [Cobrado na 1ª Avaliação]
--------------------------------------------------------------------------------
Duas Etapas Fundamentais para calcular uma raiz [1-3]:
1. Fase de Localização (Isolamento): Encontrar um intervalo [a,b] que contenha a raiz. 
   Pode ser feito via análise gráfica ou testando a mudança de sinal.
2. Fase de Refinamento: Melhorar o valor da raiz usando os algoritmos numéricos 
   até atingir a tolerância exigida.

Classificação dos Métodos [4-6]:
- Métodos Intervalares (Fechados): Bissecção e Posição Falsa. Exigem um intervalo 
  inicial que delimite a raiz. Sempre convergem, mas costumam ser mais lentos.
- Métodos Abertos: Newton-Raphson e Secante. Exigem um ou dois chutes iniciais. 
  Não precisam isolar a raiz, são muito mais rápidos, porém podem divergir.

Teorema de Bolzano [5, 7, 8]:
- Se f(a) * f(b) < 0, existe pelo menos um número ímpar de raízes (ou uma única) 
  no intervalo [a,b]. Se for > 0, pode não existir ou existir um número par.

--------------------------------------------------------------------------------
2. RESUMO DOS MÉTODOS DE RAÍZES
--------------------------------------------------------------------------------
A. MÉTODO DA BISSECÇÃO [9-11]:
   - Lógica: Divide o intervalo [a,b] ao meio ( xm = (a+b)/2 ) sucessivamente.
   - Esforço Computacional: Lento (convergência linear), mas de fácil implementação.
   - Fórmula de Iterações Previstas: Para garantir uma precisão E, o número 
     mínimo de iterações k é calculado por: k > (log(b - a) - log(E)) / log(2).

B. MÉTODO DE NEWTON-RAPHSON [12-14]:
   - Lógica: Traça uma reta tangente a partir do chute inicial (usa a derivada).
   - Fórmula de iteração: x_novo = x - (f(x) / f'(x)).
   - Velocidade: Muito rápido (Convergência Quadrática - o erro dobra de casas 
     decimais a cada passo).
   - Armadilha: Falha/Diverge se a derivada f'(x) for igual ou muito próxima 
     de zero (pontos de máximo/mínimo) [15, 16].

C. MÉTODO DAS SECANTES [17-19]:
   - Lógica: Substitui a derivada analítica do método de Newton por uma 
     aproximação via diferença dividida (reta secante).
   - Fórmula: x_novo = x_i - (f(x_i) * (x_i - x_i_1)) / (f(x_i) - f(x_i_1)).
   - Necessita de 2 chutes iniciais, mas foge do trabalho de calcular derivadas.

--------------------------------------------------------------------------------
3. TEORIA DOS SISTEMAS LINEARES (GAUSS-SEIDEL E JACOBI)
--------------------------------------------------------------------------------
Modelagem de Problemas (Ex: Fábricas e Insumos) [20, 21]:
- Cada setor de produção ou limite de material vira uma LINHA (equação).
- Cada produto a ser descoberto vira uma COLUNA (variável x1, x2, x3).

Diferença entre Jacobi e Gauss-Seidel [22-24]:
- Gauss-Jacobi: Usa as variáveis velhas (da iteração anterior) para calcular 
  toda a linha atual.
- Gauss-Seidel: É uma evolução. Usa as variáveis que ACABARAM de ser calculadas 
  imediatamente na mesma iteração, garantindo convergência mais rápida.

Critérios de Convergência (MUITO COBRADO) [25-27]:
A convergência nos métodos iterativos é garantida se a matriz satisfizer:
1. Critério das Linhas (Matriz Estritamente Diagonal Dominante):
   O valor absoluto da diagonal principal de cada linha DEVE ser maior que a 
   soma dos valores absolutos dos outros elementos da mesma linha.
   Se não for, permute (troque) a ordem das linhas da matriz antes de calcular!
2. Critério de Sassenfeld (Específico para Gauss-Seidel):
   Se o maior Beta calculado para as linhas for < 1, o sistema vai convergir.
* Nota Teórica: Esses critérios são SUFICIENTES, mas não NECESSÁRIOS. Ou seja, 
  mesmo se a matriz falhar no teste, o método ainda pode convergir [25, 28].

--------------------------------------------------------------------------------
4. CRITÉRIOS DE PARADA E CÁLCULOS ÚTEIS PARA O PYTHON [10, 29, 30]
--------------------------------------------------------------------------------
Para interromper os laços (while/for) dos seus algoritmos, utilize os erros:
- Erro Absoluto:  | x_novo - x_antigo | <= Tolerância
- Erro Relativo: (| x_novo - x_antigo |) / | x_novo | <= Tolerância
- Limite de Segurança: k > Máximo_de_Iterações (Geralmente 50).

COMO FACILITAR SUA VIDA NO CÓDIGO (Uso de Bibliotecas) [31-33]:
- Chutes iniciais: Use `import matplotlib.pyplot as plt` para plotar plt.plot(x, f(x)) 
  e achar visualmente os intervalos da Bissecção e o x0 de Newton.
- Derivadas Inimigas (Para Newton): Use a biblioteca `sympy`. 
  Ex: sp.diff(funcao, x) faz o Python derivar qualquer equação automaticamente.
- Matrizes e Sistemas: Importe `numpy`. Use np.array([]) para construir a matriz 
  A e o vetor b. Use np.linalg.norm() para calcular rapidamente o erro máximo 
  de parada do Gauss-Seidel.
'''
