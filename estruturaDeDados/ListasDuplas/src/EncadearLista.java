public class EncadearLista {
    No cabeca;
    No cauda;

    public void inserirNoInicio(int valor) {
        No novoNo = new No(valor);
        if (cabeca == null) {
            cabeca = novoNo;
            cauda = novoNo;
        } else {
            novoNo.proximo = cabeca;
            cabeca.anterior = novoNo;
            cabeca = novoNo;
        }
    }

    public void inserirNoFinal(int valor) {
        No novoNo = new No(valor);
        if (cabeca == null) {
            cabeca = novoNo;
            cauda = novoNo;
        } else {
            novoNo.anterior = cauda;
            cauda.proximo = novoNo;
            cauda = novoNo;
        }
    }

    public void inserirOrdenado(int valor) {
        if (cabeca == null || cabeca.valor >= valor) {
            inserirNoInicio(valor);
            return;
        } else if (cauda.valor <= valor) {
            inserirNoFinal(valor);
            return;
        }

        No atual = cabeca;

        while (atual != null && atual.valor < valor) {
            atual = atual.proximo;
        }

        No novoNo = new No(valor);

        novoNo.proximo = atual;
        novoNo.anterior = atual.anterior;

        atual.anterior.proximo = novoNo;
        atual.anterior = novoNo;

        System.out.println("Valor " + valor + " inserido de forma ordenada.");
    }

    public void listarInicioAoFinal() {
        No atual = cabeca;
        if (atual == null) {
            return;
        }
        System.out.print("Elementos da lista: ");
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public void listarFinalAoInicio() {
        No atual = cauda;
        if (atual == null) {
            return;
        }
        System.out.print("Elementos da lista: ");
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.anterior;
        }
        System.out.println();
    }

    public void remover(int valor) {
        No atual = cabeca;

        while (atual != null && atual.valor != valor) {
            atual = atual.proximo;
        }

        if (atual == cabeca) {
            cabeca = atual.proximo;

            if (cabeca != null) {
                cabeca.anterior = null;
            } else {
                cauda = null;
            }
        } else if (atual == cauda) {
            cauda = atual.anterior;
            cauda.proximo = null;
        } else {
            atual.anterior.proximo = atual.proximo;

            atual.proximo.anterior = atual.anterior;
        }
    }

    public void inverter() {
        if (cabeca == null || cabeca.proximo == null) {
            return;
        }

        No atual = cabeca;
        No temp = null;

        while (atual != null) {
            temp = atual.proximo;

            atual.proximo = atual.anterior;
            atual.anterior = temp;

            atual = temp;
        }

        temp = cabeca;
        cabeca = cauda;
        cauda = temp;
    }
}
