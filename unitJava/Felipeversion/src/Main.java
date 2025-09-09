public class Main {
    public static void main(String[] args) {

        Funcionario dev = new Tecnico("Carlos", 6500.0, 30, "Tecnologia", "Desenvolvedor Java");
       // Funcionario dev2 =  new Tecnico("Murilo", 11000.0, 29, "tecnologia", "UX");  // foi apenas pra testar o erro

        Administrador adm = new Administrador("Beatriz", 9500.0, 42, "Tecnologia");

        System.out.println("dados do Funcionário ");

        System.out.println(dev.imprimirDados());

        System.out.println("\ndados do Administrador ");
        System.out.println(adm.imprimirDados());
    }
}