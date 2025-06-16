
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Duracao calc = new Duracao();

        System.out.print("Hora inicial: ");
        int hInicial = scanner.nextInt();
        
        System.out.print("Hora final: ");
        int hFinal = scanner.nextInt();

        int duracao = calc.calcular(hInicial, hFinal);

        System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);

        scanner.close();
    }
}
