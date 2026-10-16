package curso.avanzado.capitulo02;

// Scanner es una herramienta de Java para leer lo que escribimos.
import java.util.Scanner;

public class C02E05EntradaDeDatos {
    public static void main(String[] args) {
        // Preparamos una sola herramienta de lectura para este programa.
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe tu nombre: ");
        // Aquí el programa espera. Escribe en la consola Run y pulsa Enter.
        String nombre = teclado.nextLine();
        System.out.println("Hola, " + nombre);
        // Terminamos de usar el teclado; después de cerrar no volveremos a leer.
        teclado.close();
    }
}
// Escribe un nombre con espacios, por ejemplo Ana María. Se lee la línea completa.
