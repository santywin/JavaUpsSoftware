package curso.avanzado.capitulo07;

import java.util.Arrays;

public class C07E03MatricesYMetodos {
    public static void main(String[] args) {
        int[][] notas = {{8, 6}, {10, 7}}; // Dos filas; cada fila es un arreglo.
        for (int fila = 0; fila < notas.length; fila++) {
            System.out.println("Suma de fila: " + sumar(notas[fila]));
        }
        int[] valores = {9, 3, 7};
        Arrays.sort(valores); // Ordena el propio arreglo.
        System.out.println(Arrays.toString(valores));
        System.out.println(sumar(1, 2, 3));
        // args contiene argumentos recibidos desde la terminal.
        System.out.println("Argumentos recibidos: " + args.length);
    }

    // varargs acepta un arreglo o varios argumentos int; debe ser el último parámetro.
    static int sumar(int... valores) {
        int total = 0;
        for (int valor : valores) {
            total += valor;
        }
        return total;
    }
}
