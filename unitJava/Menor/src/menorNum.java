import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class menorNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Digite um número: ");
        list.add(Integer.valueOf(scanner.nextLine()));
        System.out.println("Digite outro número: ");
        list.add(Integer.valueOf(scanner.nextLine()));
        System.out.println("Digite mais um número: ");
        list.add(Integer.valueOf(scanner.nextLine()));
        Collections.sort(list);

        System.out.println("O menor número é: " + list.get(0));
    }
}