package empresa.clientes;

import empresa.util.ClienteHandler;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String email;
    private String cidade;
    private String dataDeNascimento;
    private ClienteHandler idadeCliente;

    public Cliente(String nome, String sobrenome, String email, String cidade, String dataDeNascimento, ClienteHandler clienteHandler) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.cidade = cidade;
        this.dataDeNascimento = dataDeNascimento;
        this.idadeCliente = clienteHandler;
    }

    public String toString() {
        return "Nome: " + nome +" " + sobrenome + "\nE-mail: " + email + "\nIdade: " + idadeCliente.getIdadeCliente() + "\nCidade: " + cidade;
    }
}
