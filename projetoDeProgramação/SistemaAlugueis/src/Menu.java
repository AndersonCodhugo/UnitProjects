import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private Agencia agencia;
    private ArrayList<Agencia> listaDeAgencias;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
        this.listaDeAgencias = new ArrayList<>();
    }

    public void exibirMenu() {
        System.out.println("---AGÊNCIAS CADASTRADAS---");
        for (int i = 0; i < listaDeAgencias.size(); i++) {
            System.out.println((i + 1) + " - " + listaDeAgencias.get(i).getEndereco());
        }
        System.out.println("Selecione uma agência:");
        int escolha = scanner.nextInt();
        agencia = listaDeAgencias.get(escolha - 1);
        while (true){
            System.out.println();
            System.out.println("----MENU----");
            System.out.println("1 - Cadastrar Veículo");
            System.out.println("2 - Cadastrar Cliente");
            System.out.println("3 - Listar Veículos");
            System.out.println("4 - Listar Clientes e Alugar");
            System.out.println("0 - Sair");
            System.out.println();

            int comando = scanner.nextInt();
            if (comando == 1) {
                System.out.println("Digite o tipo do veículo:" + "\n1 - Carro" + "\n2 - Moto" + "\n3 - Van");
                int tipo = scanner.nextInt();
                if (tipo == 1) {
                    System.out.println("Digite o marca do carro:");
                    String marca = scanner.next();
                    System.out.println("Digite a modelo do carro:");
                    String modelo = scanner.next();
                    System.out.println("Digite a placa do carro:");
                    int placa = scanner.nextInt();
                    System.out.println("Digite o valor do aluguel do carro:");
                    float valor = scanner.nextFloat();
                    Carro carro = new Carro(placa, valor, marca, modelo, true);
                    agencia.adicionarVeiculo(carro);
                }

                else if (tipo == 2) {
                    System.out.println("Digite o marca da moto:");
                    String marca = scanner.next();
                    System.out.println("Digite a modelo da moto:");
                    String modelo = scanner.next();
                    System.out.println("Digite a quantidade de cilindradas");
                    int cilindradas = scanner.nextInt();
                    System.out.println("Digite a placa da moto:");
                    int placa = scanner.nextInt();
                    System.out.println("Digite o valor do aluguel da moto:");
                    float valor = scanner.nextFloat();
                    Moto moto = new Moto(placa, valor, marca, modelo, cilindradas, true);
                    agencia.adicionarVeiculo(moto);
                }

                else if (tipo == 3) {
                    System.out.println("Digite o marca da van:");
                    String marca = scanner.next();
                    System.out.println("Digite a modelo da van:");
                    String modelo = scanner.next();
                    System.out.println("Digite a quantidade de lugares");
                    int lugares = scanner.nextInt();
                    System.out.println("Digite a placa da van:");
                    int placa = scanner.nextInt();
                    System.out.println("Digite o valor do aluguel da van:");
                    float valor = scanner.nextFloat();
                    Van van = new Van(placa, valor, marca, modelo, lugares, true);
                    agencia.adicionarVeiculo(van);
                }

            }

            if (comando == 2) {
                HashMap<Cliente, String> mapaClientes = agencia.getMapaClientes();

                System.out.println("Digite o CPF do cliente:");
                int cpf = scanner.nextInt();
                System.out.println("Nome:");
                String nome = scanner.next();
                
                Cliente cliente = new Cliente(cpf, mapaClientes);
                
                agencia.cadastrarCliente(cliente, nome);
                System.out.println("Cliente cadastrado com sucesso!");
            }

            if (comando == 3) {
                agencia.listarVeiculosDisponiveis();
            }

            if (comando == 4) {
                agencia.listarClientes();
                System.out.println("Deseja realizar um aluguel? (1 - Sim / 0 - Não)");
                int opcao = scanner.nextInt();
                if (opcao == 1) {
                    System.out.println("Digite o CPF do cliente:");
                    int cpfCliente = scanner.nextInt();
                    System.out.println("Digite a placa do veículo:");
                    int placaVeiculo = scanner.nextInt();
                    
                    agencia.realizarAluguel(cpfCliente, placaVeiculo);
                }
            }

            if (comando == 0) {
                break;
            }

        }

    }

    public void adicionarAgencia(Agencia a) {
        listaDeAgencias.add(a);
    }

    public void listarAgencias() {
        for (Agencia agencias : listaDeAgencias) {
            System.out.println(agencias.getEndereco());
        }
    }
}
