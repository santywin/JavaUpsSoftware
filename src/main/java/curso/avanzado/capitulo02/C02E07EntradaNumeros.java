package curso.avanzado.capitulo02;

import java.util.Scanner;

// Después de leer texto, aprendemos a leer un entero.
public class C02E07EntradaNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe tu edad en años completos: ");
        int edad = teclado.nextInt(); // En esta etapa escribe un entero, como 17.
        // nextInt deja pendiente el salto de línea del Enter.
        teclado.nextLine(); // Lo consumimos antes de pedir una línea de texto.
        System.out.print("Escribe tu ciudad: ");
        String ciudad = teclado.nextLine();
        System.out.println("El próximo año tendrás " + (edad + 1) + " años.");
        System.out.println("Ciudad: " + ciudad);
        teclado.close();
    }
}
// Si introduces letras en la edad, este programa no las gestiona todavía.
// Primero aprendemos la entrada válida; las excepciones se estudian al final.
