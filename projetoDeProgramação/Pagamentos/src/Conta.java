public class Conta {
    private String titular;
    private float saldo;

    public Conta(String titular, float saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void exibirDetalhesConta() {
        System.out.println("Titular da conta: " + this.titular + "\nSaldo Atual: " + this.saldo);
    }
}
