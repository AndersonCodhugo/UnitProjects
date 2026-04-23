import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu menuSistema = new Menu(sc);

        menuSistema.exibirMenu();

        sc.close();

    }
}