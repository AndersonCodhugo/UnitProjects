public abstract class Funcionario {
    private String nome;
    private Double salario;
    private int idade;

    public Funcionario(String nome, Double salario, int idade) {
        if (salario > 10000.0) {
            throw new IllegalArgumentException("Salário inválido! O máximo permitido é 10.000.");
        }
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
    }

    public void setSalario(Double salario) {
        if (salario > 10000.0) {
            throw new IllegalArgumentException("Salário inválido! O máximo permitido é 10.000.");
        }
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getSalario() {
        return salario;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public abstract String imprimirDados();
}