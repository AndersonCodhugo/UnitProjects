package formas;
import java.lang.Math;
import app.GeoPlano;

public class Losango extends GeoPlano implements InterfacePlanos {
    private double diagonalMaior;
    private double diagonalMenor;

    public Losango(double diagonalMaior, double diagonalMenor) {
        super("Losango");
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public void calcularPerimetro() {
        double valorPerimetro = 4 * Math.sqrt(Math.pow(this.diagonalMaior / 2, 2) + Math.pow(this.diagonalMenor / 2, 2));
        this.perimetro = valorPerimetro;
    }

    @Override
    public void calcularArea() {
        this.area = this.diagonalMaior * this.diagonalMenor / 2.0;
    }
}
