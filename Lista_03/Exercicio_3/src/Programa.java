
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro valor: ");
        int v1 = scanner.nextInt();
        System.out.print("Segundo valor: ");
        int v2 = scanner.nextInt();
        System.out.print("Terceiro valor: ");
        int v3 = scanner.nextInt();

        VerificadorNumeros verif = new VerificadorNumeros(v1, v2, v3);

        System.out.printf("MENOR = %d%n", verif.encontrarMenor());

        scanner.close();
    }
}
