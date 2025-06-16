

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        // Configura o programa para usar o ponto (.) como separador decimal
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();

        // Cria o objeto 'aluno' com as notas informadas
        Aluno aluno = new Aluno(n1, n2);

        // Calcula a nota final chamando o método do objeto
        double notaFinal = aluno.calcularNotaFinal();

        // Exibe a nota final formatada com uma casa decimal
        System.out.printf("NOTA FINAL = %.1f%n", notaFinal);

        // Estrutura condicional para verificar se o aluno foi reprovado
        if (notaFinal < 60.0) {
            System.out.println("REPROVADO");
        }

        scanner.close();
    }
}
