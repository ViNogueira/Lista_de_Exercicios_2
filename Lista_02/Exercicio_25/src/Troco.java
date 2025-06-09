
import java.util.Locale;
import java.util.Scanner;

public class Troco {

    public static void main(String[] args) {
        // Configura o Locale para usar ponto (.) como separador decimal
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Preço unitário do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Quantidade comprada: ");
        int quantidade = scanner.nextInt();

        System.out.print("Dinheiro recebido: ");
        double dinheiro = scanner.nextDouble();

        // Cria o objeto 'venda' com os dados informados
        Venda venda = new Venda(preco, quantidade, dinheiro);

        // Exibe o resultado do troco formatado com duas casas decimais
        System.out.printf("\nTROCO = %.2f%n", venda.calcularTroco());

        scanner.close();
    }
}
