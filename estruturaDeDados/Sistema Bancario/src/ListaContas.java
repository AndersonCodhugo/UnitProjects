public class ListaContas {

    private NoConta inicio;
    private NoConta ultimo;
    private int tamanho = 0;

    public void adiciona(Conta usuario) {
        NoConta novoNo = new NoConta(usuario);
        if (this.tamanho == 0) {
            this.inicio = novoNo;
        } else {
            this.ultimo.setProximo(novoNo);
        }
        this.ultimo = novoNo;
        this.tamanho++;
    }

    public void listar() {
        NoConta atual = this.inicio;
        while (atual != null) {
            System.out.println(atual.getValor());
            atual = atual.getProximo();
        }
    }
}
