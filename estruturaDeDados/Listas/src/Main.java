public class Main {
    public static void main(String[] args) {

        EncadearLista listaDeNos = new EncadearLista();
        listaDeNos.inserir(10);
        listaDeNos.inserir(20);
        listaDeNos.inserir(30);
        listaDeNos.listar();
        listaDeNos.buscar(20);
        System.out.println("---------");
        listaDeNos.excluir(20);
        listaDeNos.listar();

    }
}