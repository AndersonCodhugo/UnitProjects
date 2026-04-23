import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    public Scanner scan;
    private Map<Integer, Funcionario> bancoDeFuncionarios = new HashMap<>();
    private Map<String, Departamento> bancoDeDepartamentos = new HashMap<>();


    public Menu(Scanner scan) {
        this.scan = scan;

        GerenciadorDeArquivos.inicializarArquivos();

        GerenciadorDeArquivos.carregarDadosFuncionarios(bancoDeFuncionarios);

        GerenciadorDeArquivos.carregarDadosDepartamentos(bancoDeDepartamentos);
    }

    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int numIdFuncionarios = bancoDeFuncionarios.size();

        while(true) {
            System.out.println("1 - Cadastrar Funcionário:" + "\n2 - Cadastrar Departamento" + "\n3 - Relatório de Funcionários" + "\n0 - Sair");

            System.out.println("\nEscolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao) {
                case 1:
                    numIdFuncionarios++;
                    System.out.println("Nome e Sobrenome do Funcionário: ");

                    String input = scanner.nextLine();
                    String[] parte = input.split(" ");

                    String nome = parte[0];
                    String sobrenome = parte[1];

                    Departamento departamentoObj;

                    if (bancoDeDepartamentos.isEmpty()) {
                        System.out.println("Aviso: Nenhum departamento existe. Alocando em 'Departamento Padrão'.");
                        departamentoObj = new Departamento("Departamento Padrão", null);
                        bancoDeDepartamentos.put("Departamento Padrão", departamentoObj);
                    } else {
                        System.out.println("Departamento (nome): ");
                        String nomeDepartamento = scanner.nextLine();

                        if (bancoDeDepartamentos.containsKey(nomeDepartamento)) {
                            departamentoObj = bancoDeDepartamentos.get(nomeDepartamento);
                        } else {
                            System.out.println("Departamento novo detectado. Criando sem gerente por enquanto...");
                            departamentoObj = new Departamento(nomeDepartamento, null);
                            bancoDeDepartamentos.put(nomeDepartamento, departamentoObj);
                        }
                    }

                    System.out.println("Salário: ");
                    float salario = scanner.nextFloat();
                    scanner.nextLine();

                    System.out.println("Cargo: ");
                    String cargo = scanner.nextLine();

                    Funcionario func = new Funcionario(numIdFuncionarios, nome, sobrenome, departamentoObj, salario, cargo);
                    bancoDeFuncionarios.put(numIdFuncionarios, func);
                    
                    GerenciadorDeArquivos.salvarTodosOsDados(bancoDeFuncionarios, bancoDeDepartamentos);
                    
                    System.out.println("Funcionário cadastrado com sucesso!");

                    break;
                case 2:
                    System.out.println("Nome do Departamento: ");
                    String nomeNovoDepartamento = scanner.nextLine();

                    System.out.println("Gerente do Departamento (ID do Funcionário):");
                    int idGerente = scanner.nextInt();
                    scanner.nextLine();

                    Funcionario gerente = bancoDeFuncionarios.get(idGerente);

                    if (gerente == null) {
                        System.out.println("Erro: Funcionário não encontrado.");
                        break;
                    }

                    Departamento novoDepartamento = new Departamento(nomeNovoDepartamento, gerente);

                    gerente.alocarEmDepartamento(novoDepartamento);

                    bancoDeDepartamentos.put(nomeNovoDepartamento, novoDepartamento);
                    
                    GerenciadorDeArquivos.salvarTodosOsDados(bancoDeFuncionarios, bancoDeDepartamentos);

                    System.out.println("Departamento cadastrado com sucesso!");
                    break;

                case 3:
                    GerenciadorDeArquivos.exibirRelatorio();

                    break;
                case 0:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

    }
}