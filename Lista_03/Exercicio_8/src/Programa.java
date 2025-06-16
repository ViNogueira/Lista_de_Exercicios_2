
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Conversor conversor = new Conversor();

        System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
        char escala = scanner.next().toUpperCase().charAt(0);

        if (escala == 'F') {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double tempF = scanner.nextDouble();
            double tempC = conversor.fahrenheitParaCelsius(tempF);
            System.out.printf("Temperatura equivalente em Celsius: %.2f%n", tempC);
        } else if (escala == 'C') {
            System.out.print("Digite a temperatura em Celsius: ");
            double tempC = scanner.nextDouble();
            double tempF = conversor.celsiusParaFahrenheit(tempC);
            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f%n", tempF);
        }

        scanner.close();
    }
}
