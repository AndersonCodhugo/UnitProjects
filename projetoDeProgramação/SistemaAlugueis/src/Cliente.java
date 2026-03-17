import java.util.HashMap;

public class Cliente {
    private int cpf;
    private Veiculo veiculoAlugado;
    private HashMap<Cliente, String> mapaNomes;

    public Cliente(int cpf, HashMap<Cliente, String> mapaNomes) {
        this.cpf = cpf;
        this.mapaNomes = mapaNomes;
        this.veiculoAlugado = null;
    }

    public void alugarVeiculo(Veiculo veiculo) {
        if (veiculo.isDisponivel()) {
            veiculo.alugar();
            this.veiculoAlugado = veiculo;
            String nome = mapaNomes.get(this);
            System.out.println("Veículo alugado com sucesso para " + nome);
        } else {
            System.out.println("O veículo " + veiculo.modelo + " não está disponível.");
        }
    }

    public void devolverVeiculo() {
        if (this.veiculoAlugado != null) {
            String nome = mapaNomes.get(this);
            this.veiculoAlugado.devolver();
            System.out.println("Veículo " + this.veiculoAlugado.modelo + " devolvido por " + nome);
            this.veiculoAlugado = null;
        } else {
            String nome = mapaNomes.get(this);
            System.out.println(nome + " não tem veículo para devolver.");
        }
    }

    public int getCpf() {
        return cpf;
    }

    public void imprimirCliente() {
        String nome = mapaNomes.get(this);
        System.out.println("Cliente: " + nome + " | CPF: " + cpf);
        if (veiculoAlugado != null) {
            System.out.println("  Alugou: " + veiculoAlugado.marca + " " + veiculoAlugado.modelo);
        } else {
            System.out.println("  Nenhum veículo alugado.");
        }
    }
}
