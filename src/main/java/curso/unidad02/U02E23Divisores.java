package curso.unidad02;

public class U02E23Divisores {
    public static void main(String[] args) {
        int numero = 12; // En este ejercicio usamos un entero positivo pequeño.
        // Un divisor deja resto cero. Nunca probamos divisor cero.
        for (int divisor = 1; divisor <= numero; divisor++) {
            if (numero % divisor == 0) {
                System.out.println(divisor);
            }
        }
    }
}
