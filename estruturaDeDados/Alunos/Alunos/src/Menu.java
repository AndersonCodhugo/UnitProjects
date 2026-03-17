import java.util.Scanner;

public class Menu {
    private static int totalAlunos = 0;

    public static void exibirMenu(Scanner sc, Aluno[] turma) {
        int escolha = -1;

        while (escolha != 6) {
            System.out.println("\n1 - Inserir Aluno\n2 - Buscar Aluno\n3 - Remover Aluno\n4 - Relatórios\n5 - Mostrar Todos\n6 - Sair");
            System.out.print("Opção: ");
            escolha = sc.nextInt();
            sc.nextLine();

            if (escolha == 1) inserir(sc, turma);
            else if (escolha == 2) buscar(sc, turma);
            else if (escolha == 3) remover(sc, turma);
            else if (escolha == 4) relatorios(turma);
            else if (escolha == 5) mostrarTodos(turma);
        }
    }

    private static void inserir(Scanner sc, Aluno[] turma) {
        if (totalAlunos < turma.length) {
            Aluno a = new Aluno();
            System.out.print("Nome: ");
            a.setNome(sc.nextLine());
            System.out.print("Matrícula: ");
            a.setMatricula(sc.nextInt());
            System.out.print("Nota 1: "); a.setNota1(sc.nextDouble());
            System.out.print("Nota 2: "); a.setNota2(sc.nextDouble());
            System.out.print("Nota 3: "); a.setNota3(sc.nextDouble());
            System.out.print("Frequência (%): ");
            a.setFrequencia(sc.nextFloat());

            turma[totalAlunos] = a;
            totalAlunos++;

            System.out.println("\nAluno | Matrícula | Média | Frequência | Situação");
            System.out.println(a.getNome() + " | " + a.getMatricula() + " | " + a.getMedia() + " | " + a.getFrequencia() + " | " + a.getSituacao());
        } else {
            System.out.println("Erro: Turma cheia!");
        }
    }

    private static void mostrarTodos(Aluno[] turma) {
        if (totalAlunos == 0) return;
        System.out.println("\n--- LISTAGEM GERAL ---");
        for (int i = 0; i < totalAlunos; i++) {
            System.out.println(turma[i].getNome() + " | " + turma[i].getMatricula() + " | " + turma[i].getSituacao());
        }
    }

    private static void buscar(Scanner sc, Aluno[] turma) {
        System.out.print("Matrícula: ");
        int matricula = sc.nextInt();
        for (int i = 0; i < totalAlunos; i++) {
            if (turma[i].getMatricula() == matricula) {
                System.out.println("Achou: " + turma[i].getNome() + " | " + turma[i].getSituacao());
                return;
            }
        }
        System.out.println("Não encontrado.");
    }

    private static void remover(Scanner sc, Aluno[] turma) {
        System.out.print("Matrícula: ");
        int matricula = sc.nextInt();
        for (int i = 0; i < totalAlunos; i++) {
            if (turma[i].getMatricula() == matricula) {
                for (int j = i; j < totalAlunos - 1; j++) {
                    turma[j] = turma[j + 1];
                }
                turma[totalAlunos - 1] = null;
                totalAlunos--;
                System.out.println("Removido.");
                return;
            }
        }
    }

    private static void relatorios(Aluno[] turma) {
        if (totalAlunos == 0) return;
        double soma = 0;
        int aprovados = 0, recuperacao = 0, reprovados = 0;

        for (int i = 0; i < totalAlunos; i++) {
            soma += turma[i].getMedia();
            String situacao = turma[i].getSituacao();
            if (situacao.equals("APROVADO")) aprovados++;
            else if (situacao.equals("RECUPERAÇÃO")) recuperacao++;
            else reprovados++;
        }
        System.out.println("Média: " + (soma/totalAlunos) + " | APROVADOS: " + aprovados + " | RECUPERAÇÃO: " + recuperacao + " | REPROVADOS: " + reprovados);
    }
}