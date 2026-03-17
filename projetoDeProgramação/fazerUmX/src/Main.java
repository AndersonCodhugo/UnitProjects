import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Matriz de qual ordem? ");
        int valor = scan.nextInt();

        char[][] matriz = new char[valor][valor];

        for(int i = 0; i < valor; i++) {
            for(int j = 0; j < valor; j++) {
                if (i == j) {
                    matriz[i][j] = 'X';
                }
                else if (i == valor - (j+1)) {
                    matriz[i][j] = 'X';
                } else if (j == j + i || i == i + j || valor - 1 == j || valor - 1 == i) {
                    matriz[i][j] = 'X';
                }
                else {
                    matriz[i][j] = ' ';
                }
            }
        }

        for(int i = 0; i < valor; i++) {
            for(int j = 0; j < valor; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.print("\n");
        }

    }
}