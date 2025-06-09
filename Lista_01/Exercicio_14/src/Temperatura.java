 

import java.util.Scanner;

public class Temperatura{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Instancia nosso objeto conversor para usar seus métodos
        Conversor conversor = new Conversor();

        System.out.println("Conversor de Temperaturas ");
        System.out.println("Escolha a direção da conversão:");
        System.out.println("1: Celsius para Fahrenheit");
        System.out.println("2: Fahrenheit para Celsius");
        System.out.print("Opção: ");

        int escolha = scanner.nextInt();
        double temperaturaOriginal;

        switch (escolha) {
            case 1:
                System.out.print("Digite a temperatura em Celsius (°C): ");
                temperaturaOriginal = scanner.nextDouble();
                double fahrenheit = conversor.celsiusParaFahrenheit(temperaturaOriginal);
                // System.out.printf permite formatar a saída com duas casas decimais
                System.out.printf("%.2f°C equivale a %.2f°F\n", temperaturaOriginal, fahrenheit);
                break;
            
            case 2:
                System.out.print("Digite a temperatura em Fahrenheit (°F): ");
                temperaturaOriginal = scanner.nextDouble();
                double celsius = conversor.fahrenheitParaCelsius(temperaturaOriginal);
                System.out.printf("%.2f°F equivale a %.2f°C\n", temperaturaOriginal, celsius);
                break;

            default:
                System.out.println("Opção inválida! Por favor, execute novamente e escolha 1 ou 2.");
                break;
        }

        scanner.close();
    }
}