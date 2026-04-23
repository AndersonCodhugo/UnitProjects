public class Funcionario {
    private int id;
    private String nome;
    private String sobrenome;
    private Departamento departamento;
    private float salario;
    private String cargo;

    public Funcionario(int id, String nome, String sobrenome, Departamento departamento, float salario, String cargo) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.departamento = departamento;
        this.salario = salario;
        this.cargo = cargo;
    }

    public void alocarEmDepartamento(Departamento novoDepartamento) {
        this.departamento = novoDepartamento;
    }

    public int getId() {
        return id;
    }

    public String toCSV() {
        return this.id + "," + this.nome + "," + this.sobrenome + "," + departamento.getNome() + "," + this.salario + "," + this.cargo + "\n";
    }

}
