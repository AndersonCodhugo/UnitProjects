package formas;
import app.GeoPlano;

public class Retangulo extends GeoPlano implements InterfacePlanos {
    private double altura;
    private double largura;


    public Retangulo(double altura, double largura) {
        super("Retângulo");
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = this.altura * 2.0 + this.largura * 2.0;
    }

    @Override
    public void calcularArea() {
        this.area = 1.0 * this.altura * this.largura;
    }
}
