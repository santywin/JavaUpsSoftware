package curso.avanzado.capitulo07;

// Recorrer un arreglo para encontrar el mayor.
public class C07E04BuscarMayor {
    public static void main(String[] args) {
        int[] valores = {-8, -3, -12, -3};
        // Este arreglo tiene elementos; no usamos cero como máximo inicial.
        int mayor = valores[0];
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > mayor) {
                mayor = valores[i];
            }
        }
        System.out.println("Mayor: " + mayor); // -3
    }
}
