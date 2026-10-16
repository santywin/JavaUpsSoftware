package curso.unidad02;

// Tabla de multiplicar con for.

public class U02E13TablaMultiplicar {

    public static void main(String[] args) {

        int tabla = 7;

        // factor comienza en 1 y llega a 10 inclusive.

        for (int factor = 1; factor <= 10; factor++) {

            System.out.println(tabla + " x " + factor + " = " + (tabla * factor));

        }

    }

}
