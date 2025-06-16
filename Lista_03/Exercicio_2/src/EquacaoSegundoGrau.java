
import java.lang.Math;

public class EquacaoSegundoGrau {

    private double a;
    private double b;
    private double c;

    public EquacaoSegundoGrau(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calcularDelta() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double calcularX1() {
        double delta = calcularDelta();
        return (-b + Math.sqrt(delta)) / (2 * a);
    }

    public double calcularX2() {
        double delta = calcularDelta();
        return (-b - Math.sqrt(delta)) / (2 * a);
    }
}