package curso.avanzado.capitulo02;

import java.util.Scanner;

public class C02E06Formato {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Primer entero: ");
        int primero = teclado.nextInt(); // Escribe un entero válido.
        System.out.print("Segundo entero: ");
        int segundo = teclado.nextInt();
        // %d se sustituye por un entero; %n agrega el salto de línea del sistema.
        System.out.printf("Valores: %d y %d%n", primero, segundo);
        System.out.printf("Suma: %d%n", primero + segundo);
        // Las decisiones con if se estudian en el siguiente capítulo.
        teclado.close();
    }
}
