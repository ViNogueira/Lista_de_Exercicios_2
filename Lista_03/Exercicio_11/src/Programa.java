
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salario da pessoa: ");
        double salarioAtual = scanner.nextDouble();

        CalculadoraSalario calc = new CalculadoraSalario(salarioAtual);

        System.out.printf("Novo salario R$ %.2f%n", calc.getNovoSalario());
        System.out.printf("Aumento R$ %.2f%n", calc.getAumento());
        System.out.printf("Porcentagem = %d%%%n", calc.getPorcentagem());

        scanner.close();
    }
}
