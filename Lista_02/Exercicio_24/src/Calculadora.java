

public class Calculadora {

    // Atributos para armazenar os valores
    private int valorX;
    private int valorY;

    // Construtor para inicializar o objeto com os valores
    public Calculadora(int valorX, int valorY) {
        this.valorX = valorX;
        this.valorY = valorY;
    }

    // Método que realiza a soma e retorna o resultado
    public int somar() {
        return this.valorX + this.valorY;
    }
} 

