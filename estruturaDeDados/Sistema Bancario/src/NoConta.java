public class NoConta {

    private Conta usuario;
    private NoConta proximo;

    public NoConta(Conta usuario) {
        this.usuario = usuario;
        this.proximo = null;
    }

    public void setProximo(NoConta proximo) {
        this.proximo = proximo;
    }

    public Conta getValor() {
        return usuario;
    }

    public NoConta getProximo() {
        return proximo;
    }
}
