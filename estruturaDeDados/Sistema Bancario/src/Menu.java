import java.util.Date;
import java.util.Scanner;

public class Menu {
    Scanner scanner;
    Conta conta;
    ListaContas lista;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
        this.conta = conta;
        this.lista = lista;
    }

    public void mostrarMenu() {
        System.out.println("---MENU---");
        System.out.println("- Cadastrar Nova Conta" + "\n- Listar Todas as Contas" + "\n- Buscar Conta por Número" + "\n- Remover uma Conta" + "\n- Depositar em uma Conta" +"\n- Sacar de uma Conta" + "\n- Encerrar Conta" + "\n- Sair do Sistema");
        Scanner sc = new Scanner(System.in);

        while (true) {
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1 :
                    System.out.println("Digite o número da conta:");
                    int numeroConta = scanner.nextInt();
                    conta.setNumeroConta(numeroConta);

                    System.out.println("Digite o nome do titular:");
                    String nomeTitular = scanner.nextLine();
                    conta.setTitular(nomeTitular);

                    System.out.println("Digite o número de CPF:");
                    int numeroCpf = scanner.nextInt();
                    conta.setCpf(numeroCpf);

                    System.out.println("Digite o saldo inicial:");
                    double saldo = scanner.nextDouble();
                    conta.setSaldo(saldo);

                    System.out.println("Digite o tipo de conta: " + "\n1 - Corrente" + "\n2 - Poupança");
                    int tipoConta = scanner.nextInt();
                    if (tipoConta == 1) {
                        conta.setTipoConta("Corrente");
                    } else {
                        conta.setTipoConta("Poupança");
                    }

                    System.out.println("Digite a data de abertura:");
                    String data = scanner.nextLine();
                    conta.setDataAbertura(data);

                    System.out.println("Digite se a conta está ativa: " + "\n1 - Ativa" + "\n2 - Inativa");
                    int situacao = scanner.nextInt();
                    if (situacao == 1) {
                        conta.setAtiva(true);
                    } else {
                        conta.setAtiva(false);
                    }
                    break;
                case 2 :

                    break;

                default :
                    System.out.println("Opção Inválida");
            }
        }
    }
}
