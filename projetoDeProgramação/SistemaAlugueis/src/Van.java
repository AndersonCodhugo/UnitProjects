public class Van extends Veiculo {
    int numeroPassageiros;
    public Van(int placaId, float valorAluguel, String marca, String modelo, int numeroPassageiros, boolean disponivel) {
        super(placaId, valorAluguel, marca, modelo, disponivel);
        this.numeroPassageiros = numeroPassageiros;
    }

    @Override
    public void imprimir() {
        System.out.println("Van: " + marca + " " + modelo + " " + numeroPassageiros + " lugares" + "\nPlaca: " + placaId + "\nR$" + valorAluguel + "\nStatus: " + (disponivel ? "disponível" : "indisponível") + " para aluguel.");
    }

    public void mostrarNaLista() {
        System.out.println("A van " + marca + " " + modelo + " de placa " + placaId + " c/" + numeroPassageiros + " lugares" + " está " + "disponível para aluguel por" + " R$" + valorAluguel);
    }
}
