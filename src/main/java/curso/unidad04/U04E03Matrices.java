package curso.unidad04;

public class U04E03Matrices {
    public static void main(String[] args) {
        int[][] notas = {{8, 6}, {10, 7}};
        // El bucle exterior elige la fila; el interior recorre sus columnas.
        for (int fila = 0; fila < notas.length; fila++) {
            int suma = 0; // Se reinicia para cada estudiante.
            for (int columna = 0; columna < notas[fila].length; columna++) {
                suma += notas[fila][columna];
            }
            System.out.println("Suma fila " + fila + ": " + suma);
        }
    }
}
