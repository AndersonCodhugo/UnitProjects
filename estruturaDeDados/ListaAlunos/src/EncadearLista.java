public class EncadearLista {
    No cabeca;

    public void inserir(Aluno aluno) {
        No novoNo = new No(aluno);
        if (cabeca == null) {
            cabeca = novoNo;
        } else {
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
            System.out.println(aux.aluno);
            aux = aux.proximo;
        }
    }

    public void excluir(Aluno aluno) {
        No atual = cabeca;
        No anterior = null;

        while (atual != null && !atual.aluno.equals(aluno)) {
            anterior = atual;
            atual = atual.proximo;
        }

        if (atual != null) {
            if (anterior == null) {
                cabeca = atual.proximo;
            } else {
                anterior.proximo = atual.proximo;
            }
        } else {
            System.out.println("Aluno não encontrado para exclusão");
        }
    }

    public void buscar(Aluno aluno) {
        No atual = cabeca;
        while (atual != null && !atual.aluno.equals(aluno)) {
            atual = atual.proximo;
        }
        if (atual != null) {
            System.out.println("Aluno encontrado: " + atual.aluno);
        } else {
            System.out.println("Aluno não encontrado");
        }
    }
}