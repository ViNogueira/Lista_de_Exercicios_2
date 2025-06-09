

public class Funcionario {
    // Atributos encapsulados (privados)
    private String nome;
    private int id;
    private double salario;
    private String departamento;

    // Construtor para inicializar o objeto com todos os dados
    public Funcionario(String nome, int id, double salario, String departamento) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
        this.departamento = departamento;
    }

    // Métodos 'get' para permitir o acesso aos dados de forma controlada
    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    // Sobrescreve o método toString para uma exibição amigável dos dados
    @Override
    public String toString() {
        return String.format("ID: %d | Nome: %s | Departamento: %s | Salário: R$ %.2f",
                id, nome, departamento, salario);
    }
}