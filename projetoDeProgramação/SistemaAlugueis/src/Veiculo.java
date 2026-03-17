public class Veiculo {
    protected int placaId;
    protected float valorAluguel;
    protected String marca;
    protected String modelo;
    protected boolean disponivel;

    public Veiculo(int placaId, float valorAluguel, String marca, String modelo, boolean disponivel) {
        this.placaId = placaId;
        this.valorAluguel = valorAluguel;
        this.marca = marca;
        this.modelo = modelo;
        this.disponivel = disponivel;
    }

    public void imprimir() {
        System.out.println("Seu veículo " + marca + " " + modelo + " com a placa " + placaId + " custa um aluguel de " + valorAluguel + " e está " + (disponivel ? "disponível" : "indisponível") + " para aluguel.");
    }

    public int getPlacaId() {
        return placaId;
    }

    public void mostrarNaLista() {
        System.out.println("A van " + marca + " " + modelo + " de placa " + placaId + " custa um aluguel de " + valorAluguel + " e está " + (disponivel ? "disponível" : "indisponível") + " para aluguel.");
    }

    public void alugar() {
        disponivel = false;
    }

    public void devolver() {
        disponivel = true;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
}
