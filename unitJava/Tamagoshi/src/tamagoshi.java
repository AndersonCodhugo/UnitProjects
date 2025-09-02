public class tamagoshi {
    private String name;
    private double fome;
    private double saude;
    private int idade;

    public tamagoshi(String name, double fome, double saude, int idade) {
        this.name = name;
        this.fome = fome;
        this.saude = saude;
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getFome() {
        return fome;
    }

    public void setFome(double fome) {
        this.fome = fome;
    }

    public double getSaude() {
        return saude;
    }

    public void setSaude(double saude) {
        this.saude = saude;
    }

    public String toString() {
        return "Nome: " + this.name + " Fome: "
                + this.fome + " Saúde: "
                + this.saude + " " +
                "Idade: " + this.idade;
    }
}
