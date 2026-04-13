import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner scanner;
    Conta conta;

    List<Pagamento> todosPagamentos = new ArrayList<>();

    public Menu(Scanner scanner, Conta conta) {
        this.scanner = scanner;
        this.conta = conta;
    }

    public void iniciarMenu() {
        while (true) {
        System.out.println("===MENU SISTEMA DE PAGAMENTOS===");
        System.out.println("BEM VINDO:");
        conta.exibirDetalhesConta();
        System.out.println("1 CRIAR PAGAMENTOS");
        System.out.println("2 LISTAR PAGAMENTOS");
        System.out.println("3 MOSTRAR PAGAMENTOS COM ERRO");
        System.out.println("4 SAIR");
        System.out.println("\nEscolha uma opção:");

        ArrayList<Pagamento> pagamentos = new ArrayList<>();

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite um valor de pagamento:");
                    short valor = scanner.nextShort();

                    System.out.println("Digite um tipo para o pagamento:\n1 - Boleto\n2 - Cartão\n3 - Pix");
                    String descricao = scanner.next();

                    String tipo = "";
                    if (descricao.equals("1")) {
                        tipo = "Boleto";
                    } else if (descricao.equals("2")) {
                        tipo = "Cartão";
                    } else if (descricao.equals("3")) {
                        tipo = "Pix";
                    }

                    criarPagamento(valor, tipo);
                    break;
                case 2:
                    listarEProcessarPagamentos();
                    break;
                case 3:
                    mostrarPagamentosComErro();
                    break;
                case 4:
                    System.out.println("\nTotal de pagamentos realizados com sucesso: " + Pagamento.getQuantidadeDePagamentos());
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void criarPagamento(short valor, String tipo) {
        if (tipo.equals("Boleto")) {
            System.out.println("Digite o código do boleto:");
            int codigo = scanner.nextInt();
            System.out.println("Digite a data de vencimento (dd/mm/aaaa):");
            String data = scanner.next();

            PagamentoBoleto pag = new PagamentoBoleto(valor, "Boleto", conta, codigo, data);
            todosPagamentos.add(pag);
            System.out.println("Pagamento via Boleto criado com status Pendente!");

        } else if (tipo.equals("Cartão")) {
            System.out.println("Digite o número do cartão:");
            int numeroCartao = scanner.nextInt();
            System.out.println("Digite o limite do cartão:");
            float limite = scanner.nextFloat();

            PagamentoCartao pag = new PagamentoCartao(valor, "Cartão", conta, numeroCartao, limite);
            todosPagamentos.add(pag);
            System.out.println("Pagamento via Cartão criado com status Pendente!");

        } else if (tipo.equals("Pix")) {
            System.out.println("Digite a chave PIX:");
            String chave = scanner.next();
            System.out.println("Digite o saldo do PIX:");
            short saldo = scanner.nextShort();

            PagamentoPix pag = new PagamentoPix(valor, "Pix", conta, chave, saldo);
            todosPagamentos.add(pag);
            System.out.println("Pagamento via PIX criado com status Pendente!");
        } else {
            System.out.println("Tipo inválido.");
        }
    }

    private void listarEProcessarPagamentos() {
        System.out.println("\n--- Todos os Pagamentos ---");
        if (todosPagamentos.isEmpty()) {
            System.out.println("Nenhum pagamento cadastrado ainda.");
            return;
        }

        for (int i = 0; i < todosPagamentos.size(); i++) {
            System.out.println((i + 1) + " - " + todosPagamentos.get(i).toString());
        }

        System.out.println("\nDigite o número do pagamento que deseja PROCESSAR (ou 0 para voltar):");
        int escolha = scanner.nextInt();

        if (escolha > 0 && escolha <= todosPagamentos.size()) {
            Pagamento pagamentoEscolhido = todosPagamentos.get(escolha - 1);
            
            if (pagamentoEscolhido.getStatus().equals("Sucesso")) {
                System.out.println("Este pagamento já foi processado com sucesso!");
            } else {
                ProcessadorPagamento.executar(pagamentoEscolhido);
            }
        } else if (escolha != 0) {
            System.out.println("Opção inválida.");
        }
    }

    private void mostrarPagamentosComErro() {
        System.out.println("\n--- Pagamentos Com Erro ---");
        boolean encontrouErro = false;
        
        for (Pagamento pag : todosPagamentos) {
            if (pag.getStatus().startsWith("Erro")) {
                System.out.println(pag.toString());
                encontrouErro = true;
            }
        }
        
        if (!encontrouErro) {
            System.out.println("Nenhum pagamento com erro.");
        }
    }
}
