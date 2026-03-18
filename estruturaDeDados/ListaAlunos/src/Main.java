public class Main {
    public static void main(String[] args) {
        EncadearLista listaDeNos = new EncadearLista();
        Aluno aluno1 = new Aluno("Andinho", 2342, 9.4f);
        Aluno aluno2 = new Aluno("Curilo", 2398, 6.9f);
        Aluno aluno3 = new Aluno("Gabriel", 2387, 3.7f);

        listaDeNos.inserir(aluno1);
        listaDeNos.inserir(aluno2);
        listaDeNos.inserir(aluno3);
        listaDeNos.listar();
        listaDeNos.buscar(aluno2);
        System.out.println("---------");
        listaDeNos.excluir(aluno2);
        listaDeNos.listar();

    }
}