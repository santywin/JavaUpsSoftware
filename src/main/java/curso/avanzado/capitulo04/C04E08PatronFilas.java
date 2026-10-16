package curso.avanzado.capitulo04;

// Bucles anidados.
public class C04E08PatronFilas {
    public static void main(String[] args) {
        for (int fila = 1; fila <= 4; fila++) {
            // Por cada fila se imprimen tantos asteriscos como indica fila.
            for (int columna = 1; columna <= fila; columna++) {
                System.out.print("*");
            }
            System.out.println(); // Solo al terminar la fila cambiamos de línea.
        }
    }
}
