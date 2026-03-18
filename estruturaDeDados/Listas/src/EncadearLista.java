public class EncadearLista {
    No cabeca;

    public void inserir(int valor) {
        No novoNo = new No(valor);
        if (cabeca == null) {
            cabeca = novoNo;
        }
        else {
            No atual = cabeca;
            while (atual.proximo != null) {
                atual = atual.proximo;
        }
        atual.proximo = novoNo;
        }
    }

    public void listar() {
        No aux = cabeca;
        while (aux != null) {
            System.out.println(aux.valor);
            aux = aux.proximo;
        }
    }

    public void excluir(int valor) {
        No atual = cabeca;
        No anterior = null;
        
        while (atual != null && atual.valor != valor) {
            anterior = atual;
            atual = atual.proximo;
        }
        
        if (atual != null) {
            if (anterior == null) {
                cabeca = atual.proximo;
            } else {
                anterior.proximo = atual.proximo;
            }
        }
    }

    public void buscar(int valor) {
        No atual = cabeca;
        while (atual != null && atual.valor != valor) {
            atual = atual.proximo;
        }
        if (atual != null) {
            System.out.println("Valor encontrado: " + atual.valor);
        }
        else {
            System.out.println("Valor não encontrado");
        }

    }

}
