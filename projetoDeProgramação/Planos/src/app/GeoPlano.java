package app;

public abstract class GeoPlano {
    private int perimetro;
    private int area;
    private String tipo;

    public GeoPlano(int perimetro, int area, String tipo) {
        this.perimetro = 0;
        this.area = 0;
        this.tipo = tipo;
    }

    public abstract void imprimirPerimetro();

    public abstract void imprimirArea();
}
