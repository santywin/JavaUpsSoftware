package curso.unidad04;

import java.util.Arrays;

public class U04E04Burbuja {
    public static void main(String[] args) {
        int[] numeros = {5, -2, 5, 1};
        ordenar(numeros);
        // Arrays.toString solo muestra el arreglo; no realiza el ordenamiento.
        System.out.println(Arrays.toString(numeros));
    }

    static void ordenar(int[] numeros) {
        // En cada pasada, el mayor valor pendiente llega al extremo derecho.
        for (int pasada = 0; pasada < numeros.length - 1; pasada++) {
            for (int i = 0; i < numeros.length - 1 - pasada; i++) {
                if (numeros[i] > numeros[i + 1]) {
                    int temporal = numeros[i];
                    numeros[i] = numeros[i + 1];
                    numeros[i + 1] = temporal;
                }
            }
        }
    }
}
