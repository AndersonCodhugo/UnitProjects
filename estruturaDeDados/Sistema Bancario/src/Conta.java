public class Conta {
    private int numeroConta;
    private String titular;
    private int cpf;
    private double saldo;
    private String tipoConta;
    private String dataAbertura;
    private boolean ativa;

    public Conta(int numeroConta, String titular, int cpf, double saldo, String tipoConta, String dataAbertura, boolean ativa) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.cpf = cpf;
        this.saldo = 0;
        this.tipoConta = tipoConta;
        this.dataAbertura = dataAbertura;
        this.ativa = ativa;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
}
