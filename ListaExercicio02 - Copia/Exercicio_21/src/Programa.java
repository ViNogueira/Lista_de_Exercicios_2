// Arquivo: Programa.java

import java.util.Locale; 
import java.util.Scanner; 

public class Programa {

    public static void main(String[] args) {
        // Configura o Locale para usar ponto (.) como separador decimal
        Locale.setDefault(Locale.US);
        
        // Cria o Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura do terreno: ");
        double largura = scanner.nextDouble();

        System.out.print("Digite o comprimento do terreno: ");
        double comprimento = scanner.nextDouble();

        System.out.print("Digite o valor do metro quadrado: ");
        double valorMetro = scanner.nextDouble();

        // Cria o objeto 'terreno' usando a classe Terreno e os dados fornecidos
        Terreno terreno = new Terreno(largura, comprimento, valorMetro);
        
        // Exibe os resultados formatados com duas casas decimais
        System.out.printf("\nArea do terreno = %.2f%n", terreno.calcularArea());
        System.out.printf("Preco do terreno = %.2f%n", terreno.calcularPreco());

        // Fecha o Scanner para liberar recursos
        scanner.close();
    }
}

