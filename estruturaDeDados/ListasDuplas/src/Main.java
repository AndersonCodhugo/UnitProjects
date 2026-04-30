public class Main {
    public static void main(String[] args) {

        EncadearLista listaDeNos = new EncadearLista();
        listaDeNos.inserirOrdenado(50);
        listaDeNos.inserirOrdenado(67);
        listaDeNos.inserirOrdenado(99);

        listaDeNos.inserirOrdenado(18);
        listaDeNos.inserirOrdenado(89);

//        listaDeNos.remover(67);
//        System.out.println("Valor removido 67");

        listaDeNos.listarInicioAoFinal();
//        listaDeNos.listarFinalAoInicio();

        listaDeNos.inverter();

        listaDeNos.listarInicioAoFinal();
    }
}