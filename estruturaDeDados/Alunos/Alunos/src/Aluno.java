public class Aluno {
    private String nome;
    private int matricula;
    private double nota1, nota2, nota3;
    private float frequencia;
    private double media;
    private String situacao;

    public Aluno() {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.frequencia = frequencia;
        this.media = media;
    }

    public double getMedia() {
        this.media = 1.0 * (nota1 + nota2 + nota3) / 3;
        return this.media;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public float getFrequencia() {
        return frequencia;
    }

    public String getSituacao() {
        if (this.media >= 7 && frequencia >= 75) {
            return "APROVADO";
        }
        else if (this.media >= 5 && frequencia >= 75) {
            return "RECUPERAÇÃO";
        }
        else if (this.media < 5 || frequencia < 75) {
            return "REPROVADO";
        }
        return null;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public void setFrequencia(float frequencia) {
        this.frequencia = frequencia;
    }


}
