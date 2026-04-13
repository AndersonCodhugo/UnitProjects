public class PagamentoCartao extends Pagamento {
    protected int numeroDoCartao;
    private float limiteDisponivel;

    public PagamentoCartao(short valor, String descricao, Conta conta, int numeroDoCartao, float limiteDisponivel) {
        super(valor, descricao, conta);
        this.numeroDoCartao = numeroDoCartao;
        this.limiteDisponivel = limiteDisponivel;
    }

    @Override
    public void processarPagamento() throws Exception {
        if (this.valor <= 0) {
            throw new IllegalArgumentException("Valor inválido: o valor do pagamento não pode ser zero ou negativo.");
        }

        if (numeroDoCartao <= 0) {
            throw new NullPointerException("Dados inválidos: número do cartão não pode ser zero ou negativo.");
        }

        if (this.limiteDisponivel < this.valor) {
            throw new SaldoInsuficienteException("Limite insuficiente no cartão de crédito.");
        }

        this.limiteDisponivel -= this.valor;
        quantidadeDePagamentos++;
        this.status = "Sucesso";
    }

    @Override
    public String toString() {
        return super.toString() + " | Limite Restante: R$ " + limiteDisponivel;
    }
}
