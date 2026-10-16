package curso.unidad04;

public class U04E08BusquedaLineal {
    public static void main(String[] args) {
        int[] valores = {8, 4, 9, 4};
        System.out.println("Posición de 4: " + buscar(valores, 4));
        System.out.println("Posición de 7: " + buscar(valores, 7));
    }

    // Devuelve el primer índice coincidente, o -1 si no se encuentra.
    static int buscar(int[] valores, int buscado) {
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == buscado) {
                return i;
            }
        }
        return -1; // Un arreglo vacío también llega aquí.
    }
}
