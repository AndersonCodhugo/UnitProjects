package filas;

public class ElementoFila <T> {
    public T valor;
    public ElementoFila<T> next;

    public ElementoFila(T valor){ this.valor = valor; }
}