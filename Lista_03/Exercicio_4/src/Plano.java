

public class Plano {
    private final int FRANQUIA_MINUTOS = 100;
    private final double VALOR_BASE = 50.00;
    private final double CUSTO_POR_MINUTO_EXCEDENTE = 2.00;

    private int minutosConsumidos;

    public Plano(int minutosConsumidos) {
        this.minutosConsumidos = minutosConsumidos;
    }

    public double calcularValorAPagar() {
        if (minutosConsumidos <= FRANQUIA_MINUTOS) {
            return VALOR_BASE;
        } else {
            int minutosExcedentes = minutosConsumidos - FRANQUIA_MINUTOS;
            double custoExtra = minutosExcedentes * CUSTO_POR_MINUTO_EXCEDENTE;
            return VALOR_BASE + custoExtra;
        }
    }
}
