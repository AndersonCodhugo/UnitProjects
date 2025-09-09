public class FuncionarioAdm extends Funcionarios {

    public FuncionarioAdm(String nomeFuncionario, double salarioFuncionario, int idadeFuncionario, String departamento) {
        super(nomeFuncionario, salarioFuncionario, idadeFuncionario, departamento, null);
    }

    @Override
    public void exibir() {
        System.out.println("--- Funcionário Administrativo ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Salário: R$" + getSalario());
        System.out.println("Departamento: " + this.departamento);
        System.out.println();
    }
}