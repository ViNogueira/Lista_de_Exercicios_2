


public class Verificador {

    /**
     * Verifica se uma string é um palíndromo.
     * Desconsidera espaços e diferenças entre maiúsculas e minúsculas.
     * @param texto A string a ser verificada.
     * @return true se for um palíndromo, false caso contrário.
     */
    public boolean ehPalindromo(String texto) {
        // 1. Pré-processamento: remove espaços e converte para minúsculas.
        // "\\s+" é uma expressão regular que encontra todos os espaços.
        String textoProcessado = texto.replaceAll("\\s+", "").toLowerCase();

        // 2. Inverte a string processada usando a classe StringBuilder.
        // É a forma mais eficiente de manipular strings em Java.
        String textoInvertido = new StringBuilder(textoProcessado).reverse().toString();

        // 3. Compara a string processada com a sua versão invertida.
        return textoProcessado.equals(textoInvertido);
    }
}