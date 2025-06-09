
import java.util.Scanner;

public class Duracao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a duracao em segundos: ");
        int duracao = scanner.nextInt();

        // Cria o objeto 'conversor' com o valor lido
        ConversorDeTempo conversor = new ConversorDeTempo(duracao);

        // Obtém cada parte do tempo através dos métodos do objeto
        int horas = conversor.getHoras();
        int minutos = conversor.getMinutos();
        int segundos = conversor.getSegundos();

        // Exibe o resultado no formato h:m:s
        System.out.printf("\n%d:%d:%d%n", horas, minutos, segundos);

        scanner.close();
    }
}
