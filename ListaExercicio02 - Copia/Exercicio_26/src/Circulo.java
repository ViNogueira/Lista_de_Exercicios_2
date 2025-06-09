
import java.lang.Math; // Importa a biblioteca Math para usar PI

public class Circulo {

    // Atributo privado para o raio
    private double raio;

    // Construtor que recebe o valor do raio ao criar o objeto
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Método que calcula a área do círculo
    public double calcularArea() {
        // Fórmula: area = PI * raio²
        return Math.PI * Math.pow(this.raio, 2);
    }
}