package curso.unidad02;

public class U02E18BreakContinue {

    public static void main(String[] args) {

        for (int numero = 1; numero <= 10; numero++) {

            if (numero == 3) {

                continue; // Omite el resto de esta vuelta; pasa a la actualización.

            }

            if (numero == 7) {

                break; // Termina el bucle completo.

            }

            System.out.println(numero); // Salida: 1, 2, 4, 5, 6.

        }

    }

}
