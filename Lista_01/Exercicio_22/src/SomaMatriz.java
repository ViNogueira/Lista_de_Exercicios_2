

import java.util.Scanner;

public class SomaMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Soma das Diagonais de uma Matriz Quadrada ");

        // --- 1. Obter a ordem da matriz ---
        System.out.print("Digite a ordem da matriz (n x n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("A ordem da matriz deve ser um número positivo.");
            scanner.close();
            return;
        }

        // --- 2. Criar e preencher a matriz ---
        int[][] matriz = new int[n][n];
        System.out.println("\nAgora, preencha a matriz:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Digite o valor para a posição [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        // --- 3. Calcular a soma das diagonais ---
        int somaPrincipal = 0;
        int somaSecundaria = 0;

        // Podemos usar um único loop para percorrer ambas as diagonais
        for (int i = 0; i < n; i++) {
            // A diagonal principal tem elementos onde linha == coluna (ex: [0][0], [1][1])
            somaPrincipal += matriz[i][i];
            
            // A diagonal secundária tem elementos onde linha + coluna == n-1 (ex: [0][2], [1][1], [2][0] para n=3)
            somaSecundaria += matriz[i][n - 1 - i];
        }

        // --- 4. Exibir os resultados ---
        System.out.println("\n Matriz Informada ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d\t", matriz[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("\n Resultados ");
        System.out.println("↘️ Soma da Diagonal Principal: " + somaPrincipal);
        System.out.println("↙️ Soma da Diagonal Secundária: " + somaSecundaria);

        scanner.close();
    }
}