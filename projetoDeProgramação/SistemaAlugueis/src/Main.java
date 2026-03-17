import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Menu menu = new Menu(scanner);
        Agencia agencia1 = new Agencia("Augusto Franco");
        Agencia agencia2 = new Agencia("Marcos Freire");
        menu.adicionarAgencia(agencia1);
        menu.adicionarAgencia(agencia2);

//        menu.listarAgencias();
//
//        Carro carro = new Carro(14522, 190, "Chevrolet", "Astra", true);
//
//        Moto moto = new Moto(9843, 90, "Honda", "CG", 150, true);
//
//        Van van = new Van(9883, 210, "Renault", "Kangoo", 7, true);
//
//        Cliente cliente_1 = new Cliente(07232324);
//
//        agencia1.adicionarVeiculo(carro);
//        agencia1.adicionarVeiculo(moto);
//        agencia2.adicionarVeiculo(van);
//
//        System.out.println();

        menu.exibirMenu();

    }
}
