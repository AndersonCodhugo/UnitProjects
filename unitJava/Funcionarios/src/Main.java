public class Main {
    public static void main(String[] args) {
        Funcionarios funcionario1 = new Funcionarios("Anderson", 9000, 19, "Analise", "Ti");
        //Código para teste de excessão -->
        //Funcionarios funcionario2 = new Funcionarios("André", 11000, 14, "Analise", "Ti");

        FuncionarioAdm funcionarioAdm = new FuncionarioAdm("Felipe", 8000, 45, "Financeiro");

        funcionario1.exibir();
        //funcionario2.exibir();
        funcionarioAdm.exibir();
    }
}