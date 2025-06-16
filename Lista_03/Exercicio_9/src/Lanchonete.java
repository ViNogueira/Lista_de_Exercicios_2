
public class Lanchonete {
    
    public double getPreco(int codigo) {
        switch (codigo) {
            case 1:
                return 5.00;
            case 2:
                return 3.50;
            case 3:
                return 4.80;
            case 4:
                return 8.90;
            case 5:
                return 7.32;
            default:
                return 0.0; // Retorna 0 para código inválido
        }
    }
}
