package curso.unidad04;

import java.util.Arrays;

public class U04E09InvertirArreglo {
    public static void main(String[] args) {
        int[] valores = {1, 2, 3, 4};
        invertir(valores);
        System.out.println(Arrays.toString(valores));
    }

    static void invertir(int[] valores) {
        int izquierda = 0;
        int derecha = valores.length - 1;
        while (izquierda < derecha) {
            int temporal = valores[izquierda];
            valores[izquierda] = valores[derecha];
            valores[derecha] = temporal;
            izquierda++;
            derecha--; // Los dos extremos se acercan al centro.
        }
    }
}
