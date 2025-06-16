// Arquivo: VerificadorMultiplos.java
public class Multiplos {
    
    public boolean saoMultiplos(int a, int b) {
        // Verifica se 'a' é múltiplo de 'b' OU se 'b' é múltiplo de 'a'
        return a % b == 0 || b % a == 0;
    }
}
