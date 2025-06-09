
import java.util.Locale;
import java.util.Scanner;

public class Medidas {

    public static void main(String[] args) {
        // Configura o Locale para usar ponto (.) como separador decimal
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a medida A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite a medida B: ");
        double b = scanner.nextDouble();

        System.out.print("Digite a medida C: ");
        double c = scanner.nextDouble();

        // Cria o objeto 'calculadora' com as medidas informadas
        CalculadoraGeometrica calculadora = new CalculadoraGeometrica(a, b, c);

        // Exibe os resultados formatados com quatro casas decimais
        System.out.printf("\nAREA DO QUADRADO = %.4f%n", calculadora.calcularAreaQuadrado());
        System.out.printf("AREA DO TRIANGULO = %.4f%n", calculadora.calcularAreaTriangulo());
        System.out.printf("AREA DO TRAPEZIO = %.4f%n", calculadora.calcularAreaTrapezio());

        scanner.close();
    }
}
