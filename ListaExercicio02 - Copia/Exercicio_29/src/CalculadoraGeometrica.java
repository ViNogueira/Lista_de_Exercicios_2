
import java.lang.Math;

public class CalculadoraGeometrica {

    // Atributos privados para as medidas
    private double medidaA;
    private double medidaB;
    private double medidaC;

    // Construtor que inicializa o objeto com as três medidas
    public CalculadoraGeometrica(double a, double b, double c) {
        this.medidaA = a;
        this.medidaB = b;
        this.medidaC = c;
    }

    // Calcula a área do quadrado de lado A
    public double calcularAreaQuadrado() {
        return Math.pow(this.medidaA, 2);
    }

    // Calcula a área do triângulo retângulo com base A e altura B
    public double calcularAreaTriangulo() {
        return (this.medidaA * this.medidaB) / 2.0;
    }

    // Calcula a área do trapézio com bases A e B, e altura C
    public double calcularAreaTrapezio() {
        return ((this.medidaA + this.medidaB) * this.medidaC) / 2.0;
    }
}