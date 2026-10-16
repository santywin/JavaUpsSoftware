package curso.unidad04;

import java.util.Arrays;

public class U04E05Seleccion {
    public static void main(String[] args) {
        int[] numeros = {5, -2, 5, 1};
        ordenar(numeros);
        System.out.println(Arrays.toString(numeros));
    }

    static void ordenar(int[] numeros) {
        for (int inicio = 0; inicio < numeros.length - 1; inicio++) {
            int indiceMenor = inicio;
            // Buscamos el menor de la parte que falta ordenar.
            for (int i = inicio + 1; i < numeros.length; i++) {
                if (numeros[i] < numeros[indiceMenor]) {
                    indiceMenor = i;
                }
            }
            int temporal = numeros[inicio];
            numeros[inicio] = numeros[indiceMenor];
            numeros[indiceMenor] = temporal;
        }
    }
}
