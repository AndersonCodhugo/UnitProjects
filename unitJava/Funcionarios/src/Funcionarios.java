public class Funcionarios {
    protected String nome;
    protected double salario;
    protected int idade;
    protected String departamento;
    protected String especialidade;


    public Funcionarios(String nomeFuncionario, double salarioFuncionario, int idadeFuncionario,  String departamento, String especialidade) {
        if (salarioFuncionario > 10000.0) {
            throw new IllegalArgumentException("Salário inválido! O máximo permitido é 10.000.");
        }
        if (idadeFuncionario < 16) {
            throw new IllegalArgumentException("Idade inválida! Idade abaixo de 16 anos.");
        }
        this.nome = nomeFuncionario;
        this.salario = salarioFuncionario;
        this.idade = idadeFuncionario;
        this.departamento = departamento;
        this.especialidade = especialidade;
    }

    // Getters e Setters (sem alterações)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome == null || nome.trim().isEmpty()) {
            throw new Exception("Digite um nome válido.");
        }
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) throws Exception {
        if (salario > 10000) {
            throw new Exception("Digite um salário de até R$ 10.000");
        }
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 16) {
            throw new IllegalArgumentException("Digite uma idade válida.");
        }
        this.idade = idade;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public void exibir() {
        System.out.println("--- Funcionário ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Salário: R$" + this.salario);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println();
    }
}
