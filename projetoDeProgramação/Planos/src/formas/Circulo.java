package formas;
import app.GeoPlano;

public class Circulo extends GeoPlano implements InterfacePlanos {
    private double raio;

    public Circulo(double raio) {
        super(0, 0, "Circulo");
        this.raio = raio;
    }

    public double imprimirPerimetro(double raio) {
        return 2 * 3.14159 * raio;
    }

    public double imprimirArea(double raio) {
        return 3.14159 * raio * raio;
    }

    @Override
    public void imprimirPerimetro() {
    }

    @Override
    public void imprimirArea() {
    }
}
