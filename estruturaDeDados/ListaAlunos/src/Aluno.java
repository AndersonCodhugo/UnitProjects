import java.util.Objects;

public class Aluno {
    String nome;
    int matricula;
    float media;

    public Aluno(String nome, int matricula, float media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    @Override
    public String toString() {
        return "Aluno: " +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", media=" + media;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return matricula == aluno.matricula;
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }
}
