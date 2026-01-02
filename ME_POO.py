#1 - Uma Classe em POO é toda a estrutura para a criação de um objeto que faz parte do funcionamento crucial do algoritmo.
#2 - Atributos de instância são as definições das lógica de negócio, detalhes que formam o esqueleto do funcionamento do sistema
# e os exemplos são Numero de Matricula e Serie do Aluno.
#3 - O conceito de estado de um objeto diz respeito as condições para existência dele no sistema, o estado de um aluno poderia mudar
# em caso de por exemplo mudança de série ou uma atualização da média em determinada matéria.
#4 - Os métodos são fundamentais porque definem o comportamento ativo do objeto, contendo a lógica de como ele executa suas tarefas. 
# Para o encapsulamento, são cruciais pois atuam como a interface pública da classe protegendo os dados internos.
#7 - Os atributos representam caracteristicas do objeto e os metodos representam as ações que objetos possam ter,
#exemplos de atributos são nome, curso e matricula e metodos sao o trancar_matricula(), reativar_matricula e status()
#8 - É importante para garantir a integridade dos dados e a segurança e como o encapsulamento esconde de certa forma os dados é uma boa 
#prática para prevenção

class Aluno:
    def __init__(self, nome, curso):
        self.nome = nome
        self.curso = curso
        self.matriculado = True

    def trancar_matricula(self):
        self.matriculado = False

    def reativar_matricula(self):
        self.matriculado = True

    def status(self):
        print(f'Nome do aluno: {self.nome}')
        print(f'Nome do curso: {self.curso}')
        print(f'Está matriculado? {self.matriculado}')

meu_aluno = Aluno('Anderson', 'Medicina')
meu_aluno2 = Aluno('Felipe', 'Engenharia')

meu_aluno2.trancar_matricula()
meu_aluno.trancar_matricula()
meu_aluno.reativar_matricula()


meu_aluno.status()
meu_aluno2.status()