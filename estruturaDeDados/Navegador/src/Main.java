import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HistoricoNavegador historico = new HistoricoNavegador();
        int opcao = 0;

        while (opcao != 4) {
            historico.exibirAtual();
            System.out.println("MENU DO NAVEGADOR");
            System.out.println("1 - Buscar");
            System.out.println("2 - Voltar");
            System.out.println("3 - Avançar");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o endereço (URL): ");
                    String endereco = scanner.nextLine();
                    System.out.print("Digite o nome do site: ");
                    String nome = scanner.nextLine();
                    historico.buscar(endereco, nome);
                    break;
                case 2:
                    historico.voltar();
                    break;
                case 3:
                    historico.avancar();
                    break;
                case 4:
                    System.out.println("Navegador encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}