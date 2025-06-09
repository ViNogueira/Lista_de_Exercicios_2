

public class ConversorDeTempo {

    // Atributo para guardar o valor original
    private int totalEmSegundos;

    // Construtor que recebe o total de segundos
    public ConversorDeTempo(int segundos) {
        this.totalEmSegundos = segundos;
    }

    // Método para calcular e retornar as horas
    public int getHoras() {
        // 1 hora = 3600 segundos
        return totalEmSegundos / 3600;
    }

    // Método para calcular e retornar os minutos
    public int getMinutos() {
        // Pega o resto dos segundos após tirar as horas e divide por 60
        int resto = totalEmSegundos % 3600;
        return resto / 60;
    }

    // Método para calcular e retornar os segundos restantes
    public int getSegundos() {
        // O resto da divisão por 60 nos dá os segundos finais
        return totalEmSegundos % 60;
    }
}