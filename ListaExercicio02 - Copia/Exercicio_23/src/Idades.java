
import java.util.Locale;
import java.util.Scanner;

public class Idades {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dados da primeira pessoa:");
        System.out.print("Nome: ");
        String nome1 = scanner.nextLine();
        System.out.print("Idade: ");
        int idade1 = scanner.nextInt();

        // Cria o primeiro objeto Pessoa
        Pessoa pessoa1 = new Pessoa(nome1, idade1);

        System.out.println("Dados da segunda pessoa:");
        System.out.print("Nome: ");
        scanner.nextLine(); // Limpa o "Enter" pendente da leitura anterior (idade1)
        String nome2 = scanner.nextLine();
        System.out.print("Idade: ");
        int idade2 = scanner.nextInt();
        
        // Cria o segundo objeto Pessoa
        Pessoa pessoa2 = new Pessoa(nome2, idade2);

        // Calcula a idade média
        double idadeMedia = (double)(pessoa1.getIdade() + pessoa2.getIdade()) / 2.0;

        // Exibe o resultado final formatado
        System.out.printf("\nA idade média de %s e %s é de %.1f anos%n",
                pessoa1.getNome(), pessoa2.getNome(), idadeMedia);

        scanner.close();
    }
}
