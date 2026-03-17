import java.util.ArrayList;
import java.util.HashMap;

public class Agencia {
    private String endereco;
    private boolean veiculosDisponiveis;
    private ArrayList<Veiculo> listaDeVeiculos;
    private ArrayList<Cliente> listaDeClientes;
    private HashMap<Cliente, String> mapaClientes;

    public Agencia(String endereco) {
        this.endereco = endereco;
        this.veiculosDisponiveis = veiculosDisponiveis;
        this.listaDeVeiculos = new ArrayList<>();
        this.listaDeClientes = new ArrayList<>();
        this.mapaClientes = new HashMap<>();
    }

    public void adicionarVeiculo(Veiculo v) {
        listaDeVeiculos.add(v);
    }

    public void cadastrarCliente(Cliente c, String nome) {
        listaDeClientes.add(c);
        mapaClientes.put(c, nome);
    }

    public HashMap<Cliente, String> getMapaClientes() {
        return mapaClientes;
    }

    public void listarVeiculosDisponiveis() {
        System.out.println("Veículos Disponíveis na Agência " + endereco + ":");
        for (Veiculo v : listaDeVeiculos) {
            if (v.isDisponivel()) {
                v.mostrarNaLista();
            }
        }
    }
    
    public void listarClientes() {
        System.out.println("Clientes da Agência " + endereco + ":");
        for (Cliente c : listaDeClientes) {
             c.imprimirCliente();
        }
    }

    public void realizarAluguel(int cpfCliente, int placaVeiculo) {
        Cliente clienteEncontrado = null;
        for (Cliente c : listaDeClientes) {
            if (c.getCpf() == cpfCliente) {
                clienteEncontrado = c;
                break;
            }
        }

        Veiculo veiculoEncontrado = null;
        for (Veiculo v : listaDeVeiculos) {
            if (v.getPlacaId() == placaVeiculo) {
                veiculoEncontrado = v;
                break;
            }
        }

        if (clienteEncontrado == null) {
            System.out.println("Cliente com CPF " + cpfCliente + " não encontrado.");
        } else if (veiculoEncontrado == null) {
            System.out.println("Veículo com placa " + placaVeiculo + " não encontrado.");
        } else {
            clienteEncontrado.alugarVeiculo(veiculoEncontrado);
        }
    }

    public String getEndereco() {
        return endereco;
    }
}
