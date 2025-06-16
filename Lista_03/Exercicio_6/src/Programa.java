
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a medida da glicose: ");
        double medida = scanner.nextDouble();

        MedidorGlicose medidor = new MedidorGlicose(medida);

        System.out.printf("Classificacao: %s%n", medidor.getClassificacao());

        scanner.close();
    }
}