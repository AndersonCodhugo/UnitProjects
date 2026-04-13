import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Menu menu = new Menu(scanner);

//        Conta conta1 = new Conta(2932, "Anderson", 92302, 239.30, "Corrente", "05/04/26", true);
//        Conta conta2 = new Conta(2928, "Curilo", 99342, 123.90, "Poupança", "09/07/27", true);
//        Conta conta3 = new Conta(2998, "Jacinto", 32354, 1377.10, "Corrente", "06/05/26", true);
//
//        ListaContas valores = new ListaContas();
//
//        valores.adiciona(conta1);
//        valores.adiciona(conta2);
//        valores.adiciona(conta3);
//
//        valores.listar();



        menu.mostrarMenu();

        scanner.close();
    }
}