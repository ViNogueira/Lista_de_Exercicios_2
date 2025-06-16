

public class Aluno {

    // Atributos privados para as notas
    private double nota1;
    private double nota2;

    // Construtor para inicializar o objeto com as notas
    public Aluno(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // Método que calcula e retorna a nota final
    public double calcularNotaFinal() {
        return this.nota1 + this.nota2;
    }
}
