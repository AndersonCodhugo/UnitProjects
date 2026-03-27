import formas.Circulo;
import formas.Retangulo;
import formas.Triangulo;
import formas.Trapezio;
import formas.Losango;

public class Main {
    public static void main(String[] args) {
        System.out.println("Círculo = ");
        Circulo circulo = new Circulo(5.0);
        circulo.calcularArea();
        circulo.calcularPerimetro();
        circulo.imprimirArea();
        circulo.imprimirPerimetro();

        System.out.println("\nTriângulo = ");
        Triangulo triangulo = new Triangulo(5, 4, 3); // lado=5, altura=4, base=3
        triangulo.calcularArea();
        triangulo.calcularPerimetro();
        triangulo.imprimirArea();
        triangulo.imprimirPerimetro();

        System.out.println("\n Retângulo = ");
        Retangulo retangulo = new Retangulo(5, 10); // altura=5, largura=10
        retangulo.calcularArea();
        retangulo.calcularPerimetro();
        retangulo.imprimirArea();
        retangulo.imprimirPerimetro();

        System.out.println("\nTrapézio = ");
        Trapezio trapezio = new Trapezio(5, 4, 3); // baseMaior=5, baseMenor=4, altura=3
        trapezio.calcularArea();
        trapezio.calcularPerimetro();
        trapezio.imprimirArea();
        trapezio.imprimirPerimetro();

        System.out.println("\nLosango = ");
        Losango losango = new Losango(10, 5); // diagonalMaior=10, diagonalMenor=5
        losango.calcularArea();
        losango.calcularPerimetro();
        losango.imprimirArea();
        losango.imprimirPerimetro();
    }
}
