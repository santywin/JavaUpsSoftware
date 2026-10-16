package curso.unidad03;

public class U03E08SumaDigitosRecursiva {
    public static void main(String[] args) {
        System.out.println("Suma de dígitos de 204: " + sumarDigitos(204));
    }

    static int sumarDigitos(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Usa un entero no negativo");
        }
        if (numero < 10) {
            return numero; // Un solo dígito: caso base, también para cero.
        }
        // % 10 obtiene el último dígito; / 10 lo quita con división entera.
        return numero % 10 + sumarDigitos(numero / 10);
    }
}
