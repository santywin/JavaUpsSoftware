package curso.unidad02;

// Validar datos y manejar errores.

import java.util.Scanner;



public class U02E21Validacion {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        boolean datoValido = false;



        while (!datoValido) {

            System.out.print("Escribe una edad entre 0 y 120: ");

            // Al terminar la entrada (por ejemplo, un archivo vacío), salimos limpiamente.

            if (!teclado.hasNextLine()) {

                System.out.println("Entrada finalizada sin registrar una edad.");

                break;

            }

            String texto = teclado.nextLine();



            // try ejecuta una operación que puede lanzar una excepción.

            try {

                // parseInt convierte texto a int; trim quita espacios exteriores.

                int edad = Integer.parseInt(texto.trim());



                // Un entero puede convertirse correctamente y aun ser inadecuado.

                if (edad < 0 || edad > 120) {

                    System.out.println("La edad debe estar entre 0 y 120.");

                } else {

                    System.out.println("Edad registrada: " + edad);

                    datoValido = true; // Permite terminar el bucle.

                }

            } catch (NumberFormatException error) {

                // Letras, decimales y enteros fuera del rango de int llegan aquí.

                System.out.println("Escribe un número entero válido, por ejemplo 15.");

            }

        }



        teclado.close();

    }

}
