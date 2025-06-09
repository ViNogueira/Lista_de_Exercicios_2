
import java.util.Locale;
import java.util.Scanner;

public class RAIO {

    public static void main(String[] args) {
        // Configura o programa para usar o ponto (.) como separador decimal
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do raio do circulo: ");
        double valorRaio = scanner.nextDouble();

        // Cria o objeto 'circulo' com o raio informado pelo usuário
        Circulo circulo = new Circulo(valorRaio);

        // Exibe o resultado da área com 3 casas decimais
        System.out.printf("\nAREA = %.3f%n", circulo.calcularArea());

        scanner.close();
    }
}