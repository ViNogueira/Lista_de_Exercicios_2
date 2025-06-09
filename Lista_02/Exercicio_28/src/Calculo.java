

public class Calculo {

    // Atributos privados
    private double distanciaPercorrida;
    private double combustivelGasto;

    // Construtor para inicializar o objeto com os dados da viagem
    public Calculo(double distancia, double combustivel) {
        this.distanciaPercorrida = distancia;
        this.combustivelGasto = combustivel;
    }

    // Método que realiza o cálculo do consumo médio
    public double calcularMedia() {
        return distanciaPercorrida / combustivelGasto;
    }
}
