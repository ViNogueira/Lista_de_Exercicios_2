

import java.util.Scanner;

public class Programa {

    /**
     * Método estático que recebe as referências de dois objetos
     * e troca o conteúdo de seus atributos 'valor'.
     */
    public static void trocarValores(ValorContainer refA, ValorContainer refB) {
        System.out.println("\n... Executando a troca de valores ...\n");
        // 1. Guarda o valor do primeiro objeto em uma variável temporária
        int temp = refA.valor;
        
        // 2. O primeiro objeto recebe o valor do segundo
        refA.valor = refB.valor;

        // 3. O segundo objeto recebe o valor que foi guardado na variável temporária
        refB.valor = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Cria duas instâncias (objetos) de ValorContainer
        ValorContainer objA = new ValorContainer();
        ValorContainer objB = new ValorContainer();

        // 2. Pede ao usuário para inserir os valores
        System.out.print("Digite o valor para o Objeto A: ");
        objA.valor = scanner.nextInt();

        System.out.print("Digite o valor para o Objeto B: ");
        objB.valor = scanner.nextInt();

        // 3. Imprime os valores ANTES da troca
        System.out.println("\n Antes da Troca ");
        System.out.println("Valor do Objeto A: " + objA.valor);
        System.out.println("Valor do Objeto B: " + objB.valor);

        // 4. Chama o método estático para realizar a troca
        trocarValores(objA, objB);

        // 5. Imprime os valores DEPOIS da troca
        System.out.println(" Depois da Troca ");
        System.out.println("Valor do Objeto A: " + objA.valor);
        System.out.println("Valor do Objeto B: " + objB.valor);
        
        scanner.close();
    }
}
