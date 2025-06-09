

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Maior e Menor Elemento na Matriz ");

        // --- 1. Obter as dimensões da matriz ---
        System.out.print("Digite o número de linhas (m): ");
        int linhas = scanner.nextInt();

        System.out.print("Digite o número de colunas (n): ");
        int colunas = scanner.nextInt();

        // Validação simples para evitar matrizes inválidas
        if (linhas <= 0 || colunas <= 0) {
            System.out.println("As dimensões da matriz devem ser números positivos.");
            scanner.close();
            return;
        }

        // --- 2. Criar e preencher a matriz ---
        int[][] matriz = new int[linhas][colunas];
        System.out.println("\nAgora, preencha a matriz:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Digite o valor para a posição [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        // --- 3. Encontrar o maior e o menor elemento ---
        
        // Inicializamos 'maior' e 'menor' com o primeiro elemento da matriz.
        // Essa é uma forma segura de garantir que teremos valores de referência corretos.
        int maior = matriz[0][0];
        int menor = matriz[0][0];

        // Percorremos a matriz para encontrar os valores
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                // Verifica se o elemento atual é maior que o maior já encontrado
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
                // Verifica se o elemento atual é menor que o menor já encontrado
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        
        // --- 4. Exibir os resultados ---
        System.out.println("\n Matriz Informada ");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("%d\t", matriz[i][j]); // \t para tabular e alinhar
            }
            System.out.println(); // Pula para a próxima linha
        }
        
        System.out.println("\n Resultados ");
        System.out.println("📈 O maior elemento da matriz é: " + maior);
        System.out.println("📉 O menor elemento da matriz é: " + menor);

        scanner.close();
    }
}
