

public class Venda {

    // Atributos da Venda
    private double precoUnitario;
    private int quantidade;
    private double dinheiroRecebido;

    // Construtor para inicializar o objeto com os dados da venda
    public Venda(double precoUnitario, int quantidade, double dinheiroRecebido) {
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
        this.dinheiroRecebido = dinheiroRecebido;
    }

    // Método privado para calcular o custo total (lógica interna)
    private double calcularTotalCompra() {
        return this.precoUnitario * this.quantidade;
    }

    // Método público que calcula o troco
    public double calcularTroco() {
        double totalCompra = calcularTotalCompra();
        return this.dinheiroRecebido - totalCompra;
    }
}
