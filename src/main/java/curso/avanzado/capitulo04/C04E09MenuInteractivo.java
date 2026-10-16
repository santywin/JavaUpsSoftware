package curso.avanzado.capitulo04;

import java.util.Scanner;

// Integra do-while y switch. Escribe enteros; el manejo de letras llega en el capítulo 11.
public class C04E09MenuInteractivo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Saludar | 2. Ver curso | 0. Salir");
            opcion = teclado.nextInt(); // Se lee de nuevo en cada vuelta.
            switch (opcion) {
                case 1:
                    System.out.println("Hola, estudiante");
                    break; // Sale del switch; el bucle puede continuar.
                case 2:
                    System.out.println("Curso de Java desde cero");
                    break;
                case 0:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 0); // Solo 0 termina el menú.
        teclado.close();
    }
}
