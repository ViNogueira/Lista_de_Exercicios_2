
public class Venda {
    private double precoUnitario;
    private int quantidade;
    private double dinheiroRecebido;

    public Venda(double precoUnitario, int quantidade, double dinheiroRecebido) {
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
        this.dinheiroRecebido = dinheiroRecebido;
    }

    public double getTotalCompra() {
        return precoUnitario * quantidade;
    }
}
