

public class Funcionario {

    // Atributos privados do funcionário
    private String nome;
    private double valorPorHora;
    private int horasTrabalhadas;

    // Construtor para criar um objeto Funcionario com os dados necessários
    public Funcionario(String nome, double valorPorHora, int horasTrabalhadas) {
        this.nome = nome;
        this.valorPorHora = valorPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    // Método que calcula o pagamento total
    public double calcularPagamento() {
        return valorPorHora * horasTrabalhadas;
    }

    // Método "getter" para que a classe Programa possa acessar o nome
    public String getNome() {
        return this.nome;
    }
}