package curso.avanzado.capitulo05;

import java.util.Random;

public class C05E02SobrecargaYMath {
    public static void main(String[] args) {
        System.out.println(area(3)); // Elige la versión con un parámetro.
        System.out.println(area(3, 5)); // Elige la versión con dos parámetros.
        System.out.println(Math.sqrt(81)); // Método static de una clase de la API.
        // Una semilla fija facilita repetir la secuencia durante las pruebas.
        Random azar = new Random(42);
        int dado = azar.nextInt(6) + 1; // nextInt(6): 0 a 5; sumar 1: 1 a 6.
        System.out.println("Dado: " + dado);
    }

    static int area(int lado) {
        // lado solo existe dentro de esta llamada: alcance local.
        return lado * lado;
    }

    static int area(int base, int altura) {
        // Sobrecarga: mismo nombre, distinta lista de parámetros.
        return base * altura;
    }
}
