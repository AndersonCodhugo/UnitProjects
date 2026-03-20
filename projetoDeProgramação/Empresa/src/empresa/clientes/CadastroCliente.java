package empresa.clientes;

import java.util.ArrayList;

public class CadastroCliente {
    private Cliente cliente;
    private ArrayList<Cliente> listaDeClientes;

    public CadastroCliente(Cliente cliente) {
        this.cliente = cliente;
        this.listaDeClientes = new ArrayList<>();
    }

    public void cadastrarCliente() {
        listaDeClientes.add(cliente);
    }

    public void exibirCliente() {
        for (Cliente cliente : listaDeClientes) {
            System.out.println(cliente);
        }
    }
}
