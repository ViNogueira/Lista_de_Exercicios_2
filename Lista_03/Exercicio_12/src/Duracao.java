// Arquivo: CalculadoraDuracao.java
public class Duracao {
    
    public int calcular(int horaInicial, int horaFinal) {
        int duracao;
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            // Se a hora inicial é maior ou igual, o jogo virou o dia
            duracao = 24 - horaInicial + horaFinal;
        }
        return duracao;
    }
}