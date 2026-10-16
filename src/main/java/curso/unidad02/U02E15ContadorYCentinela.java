package curso.unidad02;

import java.util.Scanner;



public class U02E15ContadorYCentinela {

    public static void main(String[] args) {

        // Contador: conocemos de antemano cuántas veces repetir.

        int contador = 1;

        while (contador <= 3) {

            System.out.println("Paso " + contador);

            contador++;

        }



        // Centinela: un valor especial marca el final y no se procesa como dato.

        Scanner teclado = new Scanner(System.in);

        int cantidad = 0;

        double suma = 0;

        System.out.print("Nota de 0 a 10, o -1 para terminar: ");

        int nota = teclado.nextInt(); // Supuesto inicial: entrada numérica entera.

        while (nota != -1) {

            if (nota >= 0 && nota <= 10) {

                suma += nota;

                cantidad++;

            } else {

                System.out.println("Nota fuera de rango.");

            }

            System.out.print("Siguiente nota, o -1: ");

            nota = teclado.nextInt(); // Actualizar evita repetir siempre el mismo dato.

        }

        if (cantidad > 0) {

            System.out.println("Promedio: " + suma / cantidad);

        } else {

            System.out.println("No se ingresaron notas válidas.");

        }

        teclado.close();

    }

}
