
import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        int x = scanner.nextInt();

        System.out.print("Digite o valor de Y: ");
        int y = scanner.nextInt();

        // Cria um objeto da classe Calculadora, fornecendo os valores lidos
        Calculadora calculadora = new Calculadora(x, y);

        // Chama o método somar() do objeto e exibe o resultado
        System.out.printf("\nSOMA = %d%n", calculadora.somar());
        
        scanner.close();
    }
}
