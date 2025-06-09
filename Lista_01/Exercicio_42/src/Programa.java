

import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
    // Constante para o número máximo de contatos, facilitando a manutenção
    private static final int MAX_CONTATOS = 10;
    private static ArrayList<Contato> agenda = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    adicionarContato();
                    break;
                case 2:
                    listarContatos();
                    break;
                case 3:
                    buscarContato();
                    break;
                case 0:
                    System.out.println("Saindo da agenda...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("\n Agenda de Contatos ");
        System.out.println("1: Adicionar Contato");
        System.out.println("2: Listar Todos os Contatos");
        System.out.println("3: Buscar Contato por Nome");
        System.out.println("0: Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void adicionarContato() {
        // Verifica se a agenda já atingiu o limite máximo
        if (agenda.size() >= MAX_CONTATOS) {
            System.out.println("\nERRO: A agenda está cheia! Não é possível adicionar mais contatos.");
            return;
        }

        System.out.println("\n--- Adicionar Novo Contato ---");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        agenda.add(new Contato(nome, telefone, email));
        System.out.println("✅ Contato adicionado com sucesso!");
    }

    private static void listarContatos() {
        System.out.println("\n--- Lista de Contatos ---");
        if (agenda.isEmpty()) {
            System.out.println("A agenda está vazia.");
            return;
        }
        // Itera pela lista e imprime cada contato usando o método toString()
        for (int i = 0; i < agenda.size(); i++) {
            System.out.printf("%d: %s\n", (i + 1), agenda.get(i));
        }
    }

    private static void buscarContato() {
        System.out.println("\n Buscar Contato");
        System.out.print("Digite o nome do contato a ser procurado: ");
        String nomeBusca = scanner.nextLine();
        boolean encontrado = false;

        // Itera pela agenda procurando por um nome correspondente
        for (Contato contato : agenda) {
            // Usa equalsIgnoreCase para uma busca não sensível a maiúsculas/minúsculas
            if (contato.getNome().equalsIgnoreCase(nomeBusca)) {
                System.out.println("\nContato encontrado:");
                System.out.println("Telefone: " + contato.getTelefone());
                System.out.println("Email: " + contato.getEmail());
                encontrado = true;
                break; // Para a busca assim que o primeiro correspondente é encontrado
            }
        }

        if (!encontrado) {
            System.out.println("Contato com o nome '" + nomeBusca + "' não foi encontrado.");
        }
    }
}
