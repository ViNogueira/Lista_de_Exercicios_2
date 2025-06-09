
import java.util.Locale;
import java.util.Scanner;

public class Pagamento {

    public static void main(String[] args) {
        // Define o Locale para usar ponto (.) como separador decimal
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Valor por hora: ");
        double valorPorHora = scanner.nextDouble();

        System.out.print("Horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();

        // Cria o objeto 'funcionario' com os dados lidos
        Funcionario funcionario = new Funcionario(nome, valorPorHora, horasTrabalhadas);

        // Exibe a mensagem de pagamento formatada com duas casas decimais
        System.out.printf("\nO pagamento para %s deve ser %.2f%n",
                funcionario.getNome(), funcionario.calcularPagamento());

        scanner.close();
    }
}
