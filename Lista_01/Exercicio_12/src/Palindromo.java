

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Cria uma instância da nossa classe de verificação.
        Verificador verificador = new Verificador();

        System.out.println("--- Verificador de Palíndromos ---");
        System.out.print("Digite uma palavra ou frase: ");

        // Lê a linha inteira digitada pelo usuário.
        String entrada = scanner.nextLine();

        // Chama o método da classe VerificadorPalindromo.
        boolean resultado = verificador.ehPalindromo(entrada);

        // Exibe o resultado de forma amigável.
        if (resultado) {
            System.out.println("✅ É um palíndromo!");
        } else {
            System.out.println("❌ Não é um palíndromo.");
        }

        scanner.close();
    }
}
