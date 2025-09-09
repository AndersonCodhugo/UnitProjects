public class Tecnico extends Funcionario {
    private String departamento;
    private String especialidade;

    public Tecnico(String nome, Double salario, int idade, String departamento, String especialidade) {
        super(nome, salario, idade);
        this.departamento = departamento;
        this.especialidade = especialidade;
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

    @Override
    public String imprimirDados() {
        return "Nome: " + getNome() +
                "\nSalário: " + getSalario() +
                "\nIdade: " + getIdade() +
                "\nDepartamento: " + this.departamento +
                "\nEspecialidade: " + this.especialidade;
    }
}