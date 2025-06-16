
import java.lang.Math;

public class VerificadorNumeros {
    private int n1, n2, n3;

    public VerificadorNumeros(int n1, int n2, int n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public int encontrarMenor() {
        // Encontra o menor entre n1 e n2, e depois compara com n3
        return Math.min(n1, Math.min(n2, n3));
    }
}
