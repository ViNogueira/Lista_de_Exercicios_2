

import java.util.Scanner;

public class Calculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fatorial calcFatorial = new Fatorial();

        System.out.println(" Cálculo de Fatorial ");
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        try {
            // Chama o método recursivo para calcular o fatorial
            long resultado = calcFatorial.calcular(numero);
            System.out.println("O fatorial de " + numero + " é: " + resultado);
        } catch (IllegalArgumentException e) {
            // Captura o erro se o usuário digitar um número negativo
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}
