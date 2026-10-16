package curso.unidad03;

// La recursión resuelve una tarea llamando al mismo método con un caso más pequeño.
public class U03E05SumaRecursiva {
    public static void main(String[] args) {
        int resultado = sumarHasta(5);
        System.out.println("Suma de 1 a 5: " + resultado);
    }

    // En este ejercicio usamos enteros de 0 a 100 para limitar tamaño y profundidad.
    static int sumarHasta(int numero) {
        if (numero < 0 || numero > 100) {
            throw new IllegalArgumentException("Usa un número de 0 a 100");
        }
        if (numero == 0) {
            return 0; // Caso base: ya no hacemos otra llamada.
        }
        // Cada llamada reduce numero: 5, 4, 3, 2, 1, 0.
        // Los resultados vuelven en orden inverso y se van sumando.
        return numero + sumarHasta(numero - 1);
    }
}
