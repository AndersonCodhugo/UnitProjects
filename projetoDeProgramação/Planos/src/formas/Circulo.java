package formas;
import app.GeoPlano;

public class Circulo extends GeoPlano implements InterfacePlanos {
    private double raio;

    public Circulo(double raio) {
        super("Círculo");
        this.raio = raio;
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = 2 * Math.PI * this.raio;
    }

    @Override
    public void calcularArea() {
        this.area = Math.PI * this.raio * this.raio;
    }
}
