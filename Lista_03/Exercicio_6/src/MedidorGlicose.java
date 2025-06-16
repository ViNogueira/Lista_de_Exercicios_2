// Arquivo: MedidorGlicose.java
public class MedidorGlicose {
    private double medida;

    public MedidorGlicose(double medida) {
        this.medida = medida;
    }

    public String getClassificacao() {
        if (medida <= 100.0) {
            return "normal";
        } else if (medida <= 140.0) {
            return "elevado";
        } else {
            return "diabetes";
        }
    }
}
