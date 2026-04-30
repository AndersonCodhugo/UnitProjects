public class NoHistorico {
    String endereco;
    String nome;
    NoHistorico proximo;
    NoHistorico anterior;

    public NoHistorico(String endereco, String nome) {
        this.endereco = endereco;
        this.nome = nome;
        this.proximo = null;
        this.anterior = null;
    }
}
