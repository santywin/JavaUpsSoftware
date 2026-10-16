package curso.unidad03;

public class U03E07ContarParesConMetodo {
    public static void main(String[] args) {
        System.out.println("¿8 es par?: " + esPar(8));
        System.out.println("Cantidad hasta 10: " + contarParesHasta(10));
    }

    static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    // Para un límite menor que 1 no se recorre ningún número y se devuelve cero.
    static int contarParesHasta(int limite) {
        int cantidad = 0;
        for (int numero = 1; numero <= limite; numero++) {
            if (esPar(numero)) { // Reutilizamos una tarea ya definida.
                cantidad++;
            }
        }
        return cantidad;
    }
}
