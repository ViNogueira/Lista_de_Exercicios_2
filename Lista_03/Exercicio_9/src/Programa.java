
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Lanchonete lanchonete = new Lanchonete();

        System.out.print("Codigo do produto comprado: ");
        int codigo = scanner.nextInt();
        
        System.out.print("Quantidade comprada: ");
        int quantidade = scanner.nextInt();

        double precoUnitario = lanchonete.getPreco(codigo);
        double valorAPagar = precoUnitario * quantidade;

        System.out.printf("Valor a pagar: R$ %.2f%n", valorAPagar);

        scanner.close();
    }
}
