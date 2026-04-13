public class PagamentoPix extends Pagamento {
    public String chavePix;
    private short saldoPix;

    public PagamentoPix(short valor, String descricao, Conta conta, String chavePix, short saldoPix) {
        super(valor, descricao, conta);
        this.chavePix = chavePix;
        this.saldoPix = saldoPix;
    }

    @Override
    public void processarPagamento() throws Exception {
        if (this.valor <= 0) {
            throw new IllegalArgumentException("Valor inválido: o valor do pagamento PIX não pode ser zero ou negativo.");
        }

        if (chavePix == null || chavePix.trim().isEmpty()) {
            throw new NullPointerException("Dados inválidos: chave PIX não pode ser vazia ou nula.");
        }

        if (this.saldoPix < this.valor) {
            throw new SaldoInsuficienteException("Saldo PIX insuficiente para a transferência.");
        }

        this.saldoPix -= this.valor;
        quantidadeDePagamentos++;
        this.status = "Sucesso";
    }

    @Override
    public String toString() {
        return super.toString() + " | Chave PIX: " + chavePix;
    }
}
