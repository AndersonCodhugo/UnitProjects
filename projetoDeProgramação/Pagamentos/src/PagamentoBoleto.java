public class PagamentoBoleto extends Pagamento {
    private int codigoBoleto;
    private String dataVencimento;

    public PagamentoBoleto(short valor, String descricao, Conta conta, int codigoBoleto, String dataVencimento) {
        super(valor, descricao, conta);
        this.codigoBoleto = codigoBoleto;
        this.dataVencimento = dataVencimento;
    }

    @Override
    public void processarPagamento() throws Exception {
        if (this.valor <= 0) {
            throw new IllegalArgumentException("Valor inválido: o valor do pagamento não pode ser zero ou negativo.");
        }
        
        if (codigoBoleto <= 0) {
            throw new NullPointerException("Dados inválidos: código de boleto não pode ser zero ou negativo.");
        }

        if (conta.getSaldo() < this.valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente para o pagamento do boleto.");
        }

        conta.setSaldo(conta.getSaldo() - this.valor);
        quantidadeDePagamentos++;
        this.status = "Sucesso";
    }

    @Override
    public String toString() {
        return super.toString() + " | Vencimento: " + dataVencimento;
    }
}
