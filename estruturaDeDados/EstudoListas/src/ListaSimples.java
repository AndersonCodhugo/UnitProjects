public class ListaSimples {
    No inicio;
    int tamanho = 0;

    public void inserirInicio(String info) {
        No no = new No();
        no.info = info;
        no.proximo = inicio;
        inicio = no;
        tamanho++;
    }
}
