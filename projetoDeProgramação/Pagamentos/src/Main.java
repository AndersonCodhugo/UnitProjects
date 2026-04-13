import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Conta conta1 = new Conta("Anderson", 100.0f);
        Menu menu = new Menu(sc, conta1);
        menu.iniciarMenu();
    }
}