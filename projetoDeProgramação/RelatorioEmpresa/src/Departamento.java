public class Departamento {
    private String nome;
    private Funcionario gerente;


    public Departamento(String nome, Funcionario gerente) {
        this.nome = nome;
        this.gerente = gerente;
    }

    public String toCSV() {

        String idDoGerente = (this.gerente != null) ? String.valueOf(this.gerente.getId()) : "null";

        return this.nome + "," + idDoGerente + "\n";
    }


    public String getNome() {
        return nome;
    }
}
