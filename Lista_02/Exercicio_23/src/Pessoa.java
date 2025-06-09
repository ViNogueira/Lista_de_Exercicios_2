

public class Pessoa {

    // Atributos da classe
    private String nome;
    private int idade;

    // Construtor para inicializar os atributos
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos para obter os dados (getters)
    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }
}
