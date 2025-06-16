
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Multiplos verificador = new Multiplos();

        System.out.println("Digite dois numeros inteiros:");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        if (verificador.saoMultiplos(n1, n2)) {
            System.out.println("Sao multiplos");
        } else {
            System.out.println("Nao sao multiplos");
        }

        scanner.close();
    }
}

