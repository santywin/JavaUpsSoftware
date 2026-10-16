package curso.unidad03;

public class U03E06Factorial {
    public static void main(String[] args) {
        System.out.println("0! = " + factorial(0));
        System.out.println("5! = " + factorial(5));
        System.out.println("Con un bucle: " + factorialConBucle(5));
    }

    // int permite este factorial hasta 12!; el rango evita desbordamiento.
    static int factorial(int numero) {
        if (numero < 0 || numero > 12) {
            throw new IllegalArgumentException("Usa un entero de 0 a 12");
        }
        if (numero <= 1) {
            return 1; // Por definición, 0! = 1 y 1! = 1.
        }
        return numero * factorial(numero - 1);
    }

    static int factorialConBucle(int numero) {
        if (numero < 0 || numero > 12) {
            throw new IllegalArgumentException("Usa un entero de 0 a 12");
        }
        int producto = 1;
        for (int factor = 2; factor <= numero; factor++) {
            producto *= factor;
        }
        return producto;
    }
}
