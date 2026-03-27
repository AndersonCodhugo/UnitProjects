package formas;
import app.GeoPlano;

public class Trapezio extends GeoPlano implements InterfacePlanos {
    private double baseMaior;
    private double baseMenor;
    private double altura;

    public Trapezio(double baseMaior, double baseMenor, double altura) {
        super("Trapézio");
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    @Override
    public void calcularPerimetro() {
        double catetoOposto = (this.baseMaior - this.baseMenor) / 2.0;
        double lado = Math.sqrt((catetoOposto * catetoOposto) + (this.altura * this.altura));
        this.perimetro = this.baseMaior + this.baseMenor + (lado * 2);
    }

    @Override
    public void calcularArea() {
        this.area = ((this.baseMaior + this.baseMenor) * this.altura) / 2.0;
    }
}
