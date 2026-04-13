abstract class Pagamento {
    protected short valor;
    protected String descricao;
    protected Conta conta;
    protected String status = "Pendente";

    public static int quantidadeDePagamentos = 0;

    public Pagamento(short valor, String descricao, Conta conta) {
        this.valor = valor;
        this.descricao = descricao;
        this.conta = conta;
    }

    public abstract void processarPagamento() throws Exception;

    public static int getQuantidadeDePagamentos() {
        return quantidadeDePagamentos;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pagamento " + descricao + " | Valor: R$ " + valor + " | Status: " + status;
    }
}
