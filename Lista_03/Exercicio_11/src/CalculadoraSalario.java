// Arquivo: CalculadoraSalario.java
public class CalculadoraSalario {
    private double salario;
    private double novoSalario;
    private double aumento;
    private int porcentagem;

    public CalculadoraSalario(double salario) {
        this.salario = salario;
        calcularAumento();
    }

    private void calcularAumento() {
        if (salario <= 1000.00) {
            porcentagem = 20;
        } else if (salario <= 3000.00) {
            porcentagem = 15;
        } else if (salario <= 8000.00) {
            porcentagem = 10;
        } else {
            porcentagem = 5;
        }

        aumento = salario * porcentagem / 100.0;
        novoSalario = salario + aumento;
    }

    public double getNovoSalario() {
        return novoSalario;
    }

    public double getAumento() {
        return aumento;
    }



    public int getPorcentagem() {
        return porcentagem;
    }
}
