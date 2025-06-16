
public class PontoCartesiano {
    private double x;
    private double y;

    public PontoCartesiano(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String getLocalizacao() {
        if (x == 0.0 && y == 0.0) {
            return "Origem";
        } else if (x == 0.0) {
            return "Eixo Y";
        } else if (y == 0.0) {
            return "Eixo X";
        } else if (x > 0.0 && y > 0.0) {
            return "Q1";
        } else if (x < 0.0 && y > 0.0) {
            return "Q2";
        } else if (x < 0.0 && y < 0.0) {
            return "Q3";
        } else { // x > 0.0 && y < 0.0
            return "Q4";
        }
    }
}
