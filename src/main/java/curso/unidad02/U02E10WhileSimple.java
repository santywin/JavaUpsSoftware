package curso.unidad02;

// Fíjate en el inicio, la condición y la actualización del contador.

public class U02E10WhileSimple {

    public static void main(String[] args) {

        int numero = 1; // 1. Inicio: ocurre una sola vez.

        while (numero <= 3) { // 2. Condición: se consulta antes de cada vuelta.

            System.out.println(numero); // 3. Trabajo que se repite.

            numero++; // 4. Equivale a numero = numero + 1; acerca el bucle a su final.

        }

        // Al salir, numero vale 4: la última condición fue falsa.

        System.out.println("Valor al terminar: " + numero);

    }

}

// Prueba iniciar numero en 4: el cuerpo no se ejecutará ninguna vez.
