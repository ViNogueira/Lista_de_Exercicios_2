
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as tres distancias:");
        double d1 = scanner.nextDouble();
        double d2 = scanner.nextDouble();
        double d3 = scanner.nextDouble();

        CompeticaoDardo competicao = new CompeticaoDardo(d1, d2, d3);

        System.out.printf("MAIOR DISTANCIA = %.2f%n", competicao.getMaiorDistancia());

        scanner.close();
    }
}
