
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor de X: ");
        double x = scanner.nextDouble();
        
        System.out.print("Valor de Y: ");
        double y = scanner.nextDouble();

        PontoCartesiano ponto = new PontoCartesiano(x, y);

        System.out.println(ponto.getLocalizacao());

        scanner.close();
    }
}