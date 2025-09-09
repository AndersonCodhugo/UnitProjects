public class Administrador extends Funcionario {
    private String departamento;

    public Administrador(String nome, Double salario, int idade, String departamento) {
        super(nome, salario, idade);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String imprimirDados() {
        return "Nome: " + getNome() +
                "\nSalário: " + getSalario() +
                "\nIdade: " + getIdade() +
                "\nDepartamento: " + this.departamento;
    }
}