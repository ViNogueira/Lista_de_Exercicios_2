

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Cria uma instância da nossa Calculadora
        Calculadora calc = new Calculadora();

        System.out.println("--- Calculadora Simples ---");

        // Solicita e lê o primeiro número
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        // Solicita e lê o segundo número
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Solicita a operação
        System.out.println("\nEscolha a operação:");
        System.out.println("1: Soma (+)");
        System.out.println("2: Subtração (-)");
        System.out.println("3: Multiplicação (*)");
        System.out.println("4: Divisão (/)");
        System.out.print("Opção: ");
        int escolha = scanner.nextInt();

        double resultado = 0;

        // Executa a operação com base na escolha do usuário
        switch (escolha) {
            case 1:
                resultado = calc.somar(num1, num2);
                break;
            case 2:
                resultado = calc.subtrair(num1, num2);
                break;
            case 3:
                resultado = calc.multiplicar(num1, num2);
                break;
            case 4:
                resultado = calc.dividir(num1, num2);
                break;
            default:
                System.out.println("Opção inválida!");
                // Fecha o scanner e encerra o programa se a opção for inválida
                scanner.close();
                return;
        }

        // Exibe o resultado formatado
        System.out.printf("\nO resultado é: %.2f\n", resultado);

        // Fecha o scanner para liberar os recursos
        scanner.close();
    }
}
