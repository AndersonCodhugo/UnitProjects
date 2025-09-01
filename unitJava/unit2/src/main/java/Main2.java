import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7");
        int num = Integer.valueOf(scanner.nextLine());

        switch (num) {
            case 1:
                System.out.println("Seg");
                break;
            case 2:
                System.out.println("Ter");
                break;
            case 3:
                System.out.println("Qua");
                break;
            case 4:
                System.out.println("Qui");
                break;
            case 5:
                System.out.println("Sex");
                break;
            case 6:
                System.out.println("Sab");
                break;
            case 7:
                System.out.println("Dom");
                break;

            default:
                System.out.println("ERRO");
        }
    }
}