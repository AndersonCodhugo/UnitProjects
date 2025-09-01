import java.util.Scanner;

public class raizQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para ver sua raiz quadrada: ");
        int num = scanner.nextInt();

        System.out.println("A raiz quadrada de " + num + " é igual a " + (Math.sqrt(num) ));


    }
}
