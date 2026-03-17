import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de alunos: ");
        int tamanho = sc.nextInt();

        Aluno[] turma = new Aluno[tamanho];

        Menu.exibirMenu(sc, turma);

        sc.close();
    }
}