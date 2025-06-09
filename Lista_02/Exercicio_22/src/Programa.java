
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        // Configura para usar o ponto (.) como separador decimal
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Base do retangulo: ");
        double base = scanner.nextDouble();

        System.out.print("Altura do retangulo: ");
        double altura = scanner.nextDouble();

        // Cria o objeto da classe Retangulo
        Retangulo retangulo = new Retangulo(base, altura);

        // Exibe os resultados com 4 casas decimais
        System.out.printf("\nAREA = %.4f%n", retangulo.calcularArea());
        System.out.printf("PERIMETRO = %.4f%n", retangulo.calcularPerimetro());
        System.out.printf("DIAGONAL = %.4f%n", retangulo.calcularDiagonal());

        scanner.close();
    }
}
