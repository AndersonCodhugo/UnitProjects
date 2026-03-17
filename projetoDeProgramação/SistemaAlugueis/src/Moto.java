public class Moto extends Veiculo {
    int cilindradas;
    public Moto(int placaId, float valorAluguel, String marca, String modelo, int cilindradas, boolean disponivel ) {
        super(placaId, valorAluguel, marca, modelo, disponivel);
        this.cilindradas = cilindradas;
    }

    @Override
    public void imprimir() {
        System.out.println("Moto: " + marca + " " + modelo + " " + cilindradas + " cilindradas" + "\nPlaca: " + placaId + "\nR$" + valorAluguel + "\nStatus: " + (disponivel ? "disponível" : "indisponível") + " para aluguel.");
    }

    public void mostrarNaLista() {
        System.out.println("A moto " + marca + " " + modelo + " de placa " + placaId + " com" + cilindradas + " cilindradas" + " está " + "disponível para aluguel por" + " R$" + valorAluguel);
    }
}
