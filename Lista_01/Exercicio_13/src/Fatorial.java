

public class Fatorial {

    /**
     * Calcula o fatorial de um número usando recursão.
     * @param n O número inteiro não negativo.
     * @return O valor do fatorial de n.
     */
    public long calcular(int n) {
        // Validação de entrada: Fatorial não é definido para negativos.
        if (n < 0) {
            throw new IllegalArgumentException("Número não pode ser negativo.");
        }
        
        // Caso Base: A condição que para a recursão. O fatorial de 0 é 1.
        if (n == 0) {
            return 1;
        } 
        
        // Passo Recursivo: O método chama a si mesmo com um problema menor (n - 1).
        // A fórmula é: n! = n * (n-1)!
        return n * calcular(n - 1);
    }
}