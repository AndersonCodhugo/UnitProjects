package empresa.app;

import empresa.clientes.CadastroCliente;
import empresa.clientes.Cliente;
import empresa.util.ClienteHandler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---CADASTRO DE CLIENTE---");
        while (true) {
            System.out.println("Nome e Sobrenome:");
            String nomeSobrenome = sc.nextLine();

            ClienteHandler novoCliente = new ClienteHandler();
            String[] parts = nomeSobrenome.split(" ");
            String nome = parts[0];
            String sobrenome = parts[1];

            novoCliente.setNomeCompleto(nome + sobrenome);

            System.out.println("E-mail:");
            String email = sc.nextLine();

            while (!novoCliente.validarEmail(email)) {
                System.out.println("E-mail inválido. Digite novamente:");
                email = sc.nextLine();
            }

            System.out.println("Cidade:");
            String cidade = sc.nextLine();

            System.out.println("Data de Nascimento(DD-MM-AAAA): ");
            String dataNascimento = sc.nextLine();
            novoCliente.setIdadeCliente(dataNascimento);


            Cliente cliente = new Cliente(nome, sobrenome, email, cidade, dataNascimento, novoCliente);
            CadastroCliente clienteCadastrado = new CadastroCliente(cliente);
            clienteCadastrado.cadastrarCliente();
            clienteCadastrado.exibirCliente();


            System.out.println("Deseja continuar?[S/N]");
            String fim = sc.nextLine();
            fim = fim.toUpperCase();
            if (fim.equals("N")) {
                break;
            }
        }
        
        sc.close();
    }
}