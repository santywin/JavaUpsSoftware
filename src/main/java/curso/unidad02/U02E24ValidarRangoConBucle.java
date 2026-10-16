package curso.unidad02;

import java.util.Scanner;

public class U02E24ValidarRangoConBucle {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidad;
        // La primera lectura ocurre siempre. Aquí se suponen entradas enteras.
        do {
            System.out.print("Cantidad entre 1 y 5: ");
            cantidad = teclado.nextInt();
            if (cantidad < 1 || cantidad > 5) {
                System.out.println("Fuera de rango");
            }
        } while (cantidad < 1 || cantidad > 5);
        System.out.println("Cantidad aceptada: " + cantidad);
        teclado.close();
    }
}
