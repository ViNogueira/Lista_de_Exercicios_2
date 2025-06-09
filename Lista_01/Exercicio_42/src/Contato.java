

public class Contato {
    // Atributos privados para encapsular os dados
    private String nome;
    private String telefone;
    private String email;

    // Construtor que inicializa um objeto Contato com os dados necessários
    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    // Métodos 'get' para permitir o acesso externo aos atributos
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    // Sobrescreve o método toString para uma exibição formatada do contato
    @Override
    public String toString() {
        return String.format("Nome: %s | Telefone: %s | Email: %s", nome, telefone, email);
    }
}