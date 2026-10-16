package curso.unidad04;

public class U04E10Columnas {
    public static void main(String[] args) {
        int[][] notas = {{8, 6}, {10, 7}}; // Matriz rectangular y no vacía.
        // Ahora fijamos la columna y recorremos las filas.
        for (int columna = 0; columna < notas[0].length; columna++) {
            int suma = 0;
            for (int fila = 0; fila < notas.length; fila++) {
                suma += notas[fila][columna];
            }
            System.out.println("Suma columna " + columna + ": " + suma);
        }
    }
}
