package formas;
import app.GeoPlano;

public class Triangulo extends GeoPlano implements InterfacePlanos {
    private double lado;
    private double altura;
    private double base;

    public Triangulo(double lado, double altura, double base) {
        super("Triângulo");
        this.lado = lado;
        this.altura = altura;
        this.base = base;
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = this.lado + this.altura + this.base;
    }

    @Override
    public void calcularArea() {
        this.area = (this.base * this.altura) / 2.0;
    }
}
