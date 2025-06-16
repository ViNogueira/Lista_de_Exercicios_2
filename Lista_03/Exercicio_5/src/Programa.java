
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Preço unitário do produto: ");
        double preco = scanner.nextDouble();
        System.out.print("Quantidade comprada: ");
        int qtd = scanner.nextInt();
        System.out.print("Dinheiro recebido: ");
        double dinheiro = scanner.nextDouble();

        Venda venda = new Venda(preco, qtd, dinheiro);
        double total = venda.getTotalCompra();

        if (dinheiro >= total) {
            double troco = dinheiro - total;
            System.out.printf("TROCO = %.2f%n", troco);
        } else {
            double falta = total - dinheiro;
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS%n", falta);
        }

        scanner.close();
    }
}