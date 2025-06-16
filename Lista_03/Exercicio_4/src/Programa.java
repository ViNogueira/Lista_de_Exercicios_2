
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de minutos: ");
        int minutos = scanner.nextInt();

        Plano plano = new Plano(minutos);

        System.out.printf("Valor a pagar: R$ %.2f%n", plano.calcularValorAPagar());

        scanner.close();
    }
}
