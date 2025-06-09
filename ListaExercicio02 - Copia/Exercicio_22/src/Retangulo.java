
import java.lang.Math; // Importa a classe Math para cálculos matemáticos

public class Retangulo {

    // Atributos
    private double base;
    private double altura;

    // Construtor
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método que calcula a área
    public double calcularArea() {
        return base * altura;
    }

    // Método que calcula o perímetro
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    // Método que calcula a diagonal (usando o Teorema de Pitágoras)
    public double calcularDiagonal() {
        // A diagonal é a hipotenusa: d² = base² + altura²
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }
}