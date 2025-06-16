
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coeficiente a: ");
        double a = scanner.nextDouble();

        System.out.print("Coeficiente b: ");
        double b = scanner.nextDouble();

        System.out.print("Coeficiente c: ");
        double c = scanner.nextDouble();

        EquacaoSegundoGrau eq = new EquacaoSegundoGrau(a, b, c);

        // Verifica se é uma equação de segundo grau e se o delta é não-negativo
        if (a == 0 || eq.calcularDelta() < 0) {
            System.out.println("Esta equacao nao possui raizes reais");
        } else {
            System.out.printf("X1 = %.4f%n", eq.calcularX1());
            System.out.printf("X2 = %.4f%n", eq.calcularX2());
        }

        scanner.close();
    }
}
