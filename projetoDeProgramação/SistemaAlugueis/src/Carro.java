public class Carro extends Veiculo {
    public Carro(int placaId, float valorAluguel, String marca, String modelo, boolean disponivel) {
        super(placaId, valorAluguel, marca, modelo, disponivel);
    }

    @Override
    public void imprimir() {
        System.out.println("Carro: " + marca + " " + modelo + "\nPlaca: " + placaId + "\nR$" + valorAluguel + "\nStatus: " + (disponivel ? "disponível" : "indisponível") + " para aluguel.");
    }

    public void mostrarNaLista() {
        System.out.println("O carro " + marca + " " + modelo + " de placa " + placaId + " está " + "disponível para aluguel por" + " R$" + valorAluguel);
    }
}
