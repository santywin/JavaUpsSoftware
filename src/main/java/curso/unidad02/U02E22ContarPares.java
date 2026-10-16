package curso.unidad02;

public class U02E22ContarPares {
    public static void main(String[] args) {
        int limite = 10;
        int cantidad = 0;
        // El contador del recorrido y el contador de pares tienen tareas distintas.
        for (int numero = 1; numero <= limite; numero++) {
            if (numero % 2 == 0) {
                cantidad++;
            }
        }
        System.out.println("Pares entre 1 y " + limite + ": " + cantidad);
    }
}
