

import java.util.ArrayList;
import java.util.Scanner;

public class Gerenciamento {
    // Declara a lista e o scanner como estáticos para serem acessíveis pelos métodos
    private static ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consome a quebra de linha pendente

            switch (opcao) {
                case 1:
                    cadastrarFuncionario();
                    break;
                case 2:
                    calcularTotalSalariosPorDepartamento();
                    break;
                case 3:
                    listarTodosFuncionarios();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    scanner.close();
                    return; // Encerra o programa
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("\n Sistema de Gerenciamento de Funcionários ");
        System.out.println("1: Cadastrar Funcionário");
        System.out.println("2: Calcular Total de Salários por Departamento");
        System.out.println("3: Listar Todos os Funcionários");
        System.out.println("0: Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarFuncionario() {
        System.out.println("\n Cadastro de Funcionário ");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("ID: ");
        int id = scanner.nextInt();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); // Consome a quebra de linha
        System.out.print("Departamento: ");
        String departamento = scanner.nextLine();

        // Cria um novo objeto Funcionario e o adiciona à lista
        listaFuncionarios.add(new Funcionario(nome, id, salario, departamento));
        System.out.println("✅ Funcionário cadastrado com sucesso!");
    }

    private static void listarTodosFuncionarios() {
        System.out.println("\n Lista de Todos os Funcionários ");
        if (listaFuncionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }
        // Itera pela lista e imprime cada funcionário usando seu método toString()
        for (Funcionario f : listaFuncionarios) {
            System.out.println(f);
        }
    }

    private static void calcularTotalSalariosPorDepartamento() {
        System.out.println("\n Custo Total por Departamento ");
        System.out.print("Digite o nome do departamento: ");
        String depto = scanner.nextLine();

        double totalSalarios = 0;
        int count = 0;

        // Itera pela lista e soma os salários do departamento especificado
        for (Funcionario f : listaFuncionarios) {
            if (f.getDepartamento().equalsIgnoreCase(depto)) {
                totalSalarios += f.getSalario();
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Nenhum funcionário encontrado para o departamento '" + depto + "'.");
        } else {
            System.out.printf("O custo total do departamento '%s' é de R$ %.2f (%d funcionários).\n",
                    depto, totalSalarios, count);
        }
    }
}