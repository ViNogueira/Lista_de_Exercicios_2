
import java.util.Locale;
import java.util.Scanner;

public class Consumo {

    public static void main(String[] args) {
        // Define o Locale para usar ponto (.) como separador decimal
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Distancia percorrida: ");
        double distancia = scanner.nextDouble();

        System.out.print("Combustível gasto: ");
        double combustivel = scanner.nextDouble();

        // Cria o objeto 'calculo' com os dados informados
        Calculo calculo = new Calculo(distancia, combustivel);

        // Exibe o resultado do consumo médio com três casas decimais
        System.out.printf("\nConsumo medio = %.3f%n", calculo.calcularMedia());

        scanner.close();
    }
}
