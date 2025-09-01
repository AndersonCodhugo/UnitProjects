import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a distância percorrida: ");
        double dist = Double.valueOf(input.nextLine());
        
        System.out.println("Tempo percorrido:");
        double tempo = Double.valueOf(input.nextLine());
        
        if (dist/tempo > 120) {
            System.out.println("Multa!");
        }
        
    }
}
