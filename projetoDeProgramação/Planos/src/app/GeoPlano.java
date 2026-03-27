package app;

public abstract class GeoPlano {
    protected double perimetro;
    protected double area;
    protected String tipo;

    public GeoPlano(String tipo) {
        this.perimetro = 0;
        this.area = 0;
        this.tipo = tipo;
    }

    public abstract void calcularPerimetro();
    public abstract void calcularArea();

    public void imprimirPerimetro() {
        System.out.println("Perímetro do " + this.tipo + ": " + this.perimetro);
    }

    public void imprimirArea() {
        System.out.println("Área do " + this.tipo + ": " + this.area);
    }
}
