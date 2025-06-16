
import java.lang.Math;

public class CompeticaoDardo {
    private double d1, d2, d3;

    public CompeticaoDardo(double d1, double d2, double d3) {
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public double getMaiorDistancia() {
        return Math.max(d1, Math.max(d2, d3));
    }
}