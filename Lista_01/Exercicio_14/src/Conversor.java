

public class Conversor{

    /**
     * Converte uma temperatura de Celsius para Fahrenheit.
     * Fórmula: F = (C * 9/5) + 32
     * @param celsius A temperatura em graus Celsius.
     * @return A temperatura equivalente em graus Fahrenheit.
     */
    public double celsiusParaFahrenheit(double celsius) {
        // Usamos 9.0 e 5.0 para garantir que a divisão seja de ponto flutuante.
        return (celsius * 9.0 / 5.0) + 32;
    }

    /**
     * Converte uma temperatura de Fahrenheit para Celsius.
     * Fórmula: C = (F - 32) * 5/9
     * @param fahrenheit A temperatura em graus Fahrenheit.
     * @return A temperatura equivalente em graus Celsius.
     */
    public double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
} 
    

