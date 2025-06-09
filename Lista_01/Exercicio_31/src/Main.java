

public class Main {
    public static void main(String[] args) {
        System.out.println(" Manipulando Dados de um Objeto");

        // 1. Cria uma instância (objeto) da classe Numero
        Numero meuNumero = new Numero();

        // 2. Atribui um valor ao atributo do objeto
        meuNumero.valor = 42;

        // Imprime o "endereço de memória" para simulação
        // Nota: Este é um código de identidade, não o endereço real.
        System.out.println("Identificador do objeto na memória: " + System.identityHashCode(meuNumero));
        
        // 3. Chama o método do objeto para imprimir o valor
        meuNumero.imprimirValor();
    }
}
