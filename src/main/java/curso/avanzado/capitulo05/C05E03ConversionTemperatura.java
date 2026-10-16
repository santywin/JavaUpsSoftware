package curso.avanzado.capitulo05;

// Método que recibe y devuelve decimales.
public class C05E03ConversionTemperatura {
    public static void main(String[] args) {
        System.out.println("0 °C = " + convertirAFahrenheit(0) + " °F");
        System.out.println("100 °C = " + convertirAFahrenheit(100) + " °F");
    }

    static double convertirAFahrenheit(double celsius) {
        // 9.0 evita la división entera 9 / 5.
        return celsius * 9.0 / 5.0 + 32;
    }
}
