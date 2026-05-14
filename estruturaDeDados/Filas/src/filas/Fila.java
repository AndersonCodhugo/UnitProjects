package filas;

public class Fila<T> {
    private ElementoFila<T> first;
    private ElementoFila<T> last;

    public void enqueue(T valor){
        ElementoFila novoElemento = new ElementoFila(valor);

        if(isVazia()){ first = last = novoElemento; }
        else{
            last.next = novoElemento;
            last = novoElemento;
        }
    }

    public T dequeue(){
        if(isVazia()){
            System.out.println("filas.Fila vazia retornando -1 por padrão.");
            return null;
        }

        T valorRetorno = first.valor;
        first = first.next;
        if(first == null) last = null;
        return valorRetorno;
    }

    public void peek(){
        if(!isVazia()) System.out.println(first.valor);
        else System.out.println("filas.Fila vazia");
    }

    public void mostrarFila(){
        if(isVazia()){
            System.out.println("A fila está vazia.");
            return;
        }

        System.out.println("FILA");
        ElementoFila<T> atual = first;
        while(atual != null){
            System.out.println(atual.valor.toString());
            atual = atual.next;
        }
    }

    public boolean isVazia(){
        return first == null;
    }
}