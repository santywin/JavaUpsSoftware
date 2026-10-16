package curso.avanzado.capitulo04;

public class C04E04BreakContinue {
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
