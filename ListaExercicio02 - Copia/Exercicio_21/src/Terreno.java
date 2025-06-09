
public class Terreno {

    // Atributos privados para garantir o encapsulamento
    private double largura;
    private double comprimento;
    private double valorMetroQuadrado;

    // Construtor: método especial para criar um objeto Terreno já com os dados
    public Terreno(double largura, double comprimento, double valorMetroQuadrado) {
        this.largura = largura;
        this.comprimento = comprimento;
        this.valorMetroQuadrado = valorMetroQuadrado;
    }

    // Método para calcular a área
    public double calcularArea() {
        return this.largura * this.comprimento;
    }

    // Método para calcular o preço
    public double calcularPreco() {
        // Reutiliza o método de calcular a área
        return this.calcularArea() * this.valorMetroQuadrado;
    }
}
