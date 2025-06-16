
public class Conversor {
    
    public double fahrenheitParaCelsius(double tempF) {
        return (5.0 / 9.0) * (tempF - 32.0);
    }
    
    public double celsiusParaFahrenheit(double tempC) {
        return tempC * 9.0 / 5.0 + 32.0;
    }
}