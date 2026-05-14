import filas.Fila;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scan;
    Fila fila;

    public Menu(Scanner scan) {
        this.scan = scan;
        this.fila = fila;
    }

    public void iniciarMenuFilaBanco() {
    Fila fila = new Fila();
    while (true) {
        System.out.println("1 - Adicionar cliente\n" +
                "2 - Atender cliente\n" +
                "3 - Próximo cliente\n" +
                "4 - Mostrar fila\n" +
                "0 - Sair");

        int opc = scan.nextInt();
        scan.nextLine();
        switch (opc) {
            case 1:
                System.out.println("Nome do Cliente: ");
                String nome = scan.nextLine();
                fila.enqueue(nome);
                break;
            case 2:
                System.out.println("Cliente atendido: \n");
                fila.peek();
                fila.dequeue();
                break;
            case 3:
                fila.peek();
                break;
            case 4:
                fila.mostrarFila();
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Opção inválida.");
            }

        }

    }

    private void iniciarMenuMatricula() {
        Fila<Aluno> filaAtendimento = new Fila<Aluno>();
        ArrayList<Disciplina> disciplinas = new ArrayList<>();

        while (true) {
            System.out.println("\nSISTEMA DE MATRICULA");
            System.out.println("1 - Adicionar aluno na fila");
            System.out.println("2 - Atender proximo aluno");
            System.out.println("3 - Cadastrar disciplina");
            System.out.println("4 - Mostrar disciplinas");
            System.out.println("5 - Mostrar fila de atendimento");
            System.out.println("6 - Mostrar fila de espera de uma disciplina");
            System.out.println("0 - Voltar ao Menu Principal");
            System.out.print("Opcao: ");

            int opc = scan.nextInt();
            scan.nextLine();

            switch (opc) {
                case 1:
                    System.out.print("Nome do Aluno: ");
                    String nome = scan.nextLine();
                    System.out.print("Matricula do Aluno: ");
                    String matricula = scan.nextLine();
                    filaAtendimento.enqueue(new Aluno(nome, matricula));
                    System.out.println("Aluno adicionado na fila.");
                    break;
                case 2:
                    Aluno atendido = filaAtendimento.dequeue();
                    if (atendido != null) {
                        System.out.println("Atendendo: " + atendido.getNome());
                        if (disciplinas.isEmpty()) {
                            System.out.println("Nenhuma disciplina cadastrada.");
                        } else {
                            for (int i = 0; i < disciplinas.size(); i++) {
                                System.out.println((i + 1) + " - " + disciplinas.get(i).getNome() + " (" + disciplinas.get(i).getVagasDisponiveis() + " vagas)");
                            }
                            System.out.print("Escolha a disciplina: ");
                            int escolha = scan.nextInt();
                            scan.nextLine();

                            if (escolha > 0 && escolha <= disciplinas.size()) {
                                Disciplina discEscolhida = disciplinas.get(escolha - 1);
                                if (discEscolhida.matricular(atendido)) {
                                    System.out.println("Matricula realizada com sucesso.");
                                } else {
                                    System.out.println("Sem vagas. Aluno entrou na fila de espera.");
                                }
                            } else {
                                System.out.println("Opcao invalida.");
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.print("Codigo: ");
                    String codigo = scan.nextLine();
                    System.out.print("Nome da Disciplina: ");
                    String nomeDisc = scan.nextLine();
                    System.out.print("Vagas: ");
                    int vagas = scan.nextInt();
                    scan.nextLine();
                    disciplinas.add(new Disciplina(codigo, nomeDisc, vagas));
                    System.out.println("Disciplina cadastrada.");
                    break;
                case 4:
                    if (disciplinas.isEmpty()) {
                        System.out.println("Nenhuma disciplina cadastrada.");
                    } else {
                        for (Disciplina d : disciplinas) {
                            System.out.println(d.toString());
                        }
                    }
                    break;
                case 5:
                    filaAtendimento.mostrarFila();
                    break;
                case 6:
                    if (disciplinas.isEmpty()) {
                        System.out.println("Nenhuma disciplina cadastrada.");
                    } else {
                        for (int i = 0; i < disciplinas.size(); i++) {
                            System.out.println((i + 1) + " - " + disciplinas.get(i).getNome());
                        }
                        System.out.print("Opcao: ");
                        int escolhaFila = scan.nextInt();
                        scan.nextLine();

                        if (escolhaFila > 0 && escolhaFila <= disciplinas.size()) {
                            disciplinas.get(escolhaFila - 1).getFilaEspera().mostrarFila();
                        } else {
                            System.out.println("Opcao invalida.");
                        }
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opcao invalida.");
            }
        }
    }
}
