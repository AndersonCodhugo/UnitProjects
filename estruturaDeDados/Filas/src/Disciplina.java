import filas.Fila;

public class Disciplina {
    private String codigo;
    private String nome;
    private int maxVagas;
    private int vagasDisponiveis;

    private Fila<Aluno> filaEspera;

    public Disciplina(String codigo, String nome, int maxVagas) {
        this.codigo = codigo;
        this.nome = nome;
        this.maxVagas = maxVagas;
        this.vagasDisponiveis = maxVagas;
        this.filaEspera = new Fila<Aluno>();
    }

    public String getNome() { return nome; }
    public int getVagasDisponiveis() { return vagasDisponiveis; }
    public Fila<Aluno> getFilaEspera() { return filaEspera; }

    public boolean matricular(Aluno aluno) {
        if (vagasDisponiveis > 0) {
            vagasDisponiveis--;
            return true;
        } else {
            filaEspera.enqueue(aluno);
            return false;
        }
    }

    @Override
    public String toString() {
        return "[Código: " + codigo + " | Nome: " + nome + " | Vagas: " + vagasDisponiveis + "/" + maxVagas + "]";
    }
}