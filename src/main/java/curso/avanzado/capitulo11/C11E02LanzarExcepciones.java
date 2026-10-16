package curso.avanzado.capitulo11;

public class C11E02LanzarExcepciones {
    public static void main(String[] args) {
        try {
            registrarNota(15);
        } catch (IllegalArgumentException error) {
            System.out.println("No se pudo registrar: " + error.getMessage());
        } finally {
            // Se ejecuta al salir de try/catch en este flujo, haya o no excepción.
            // No sustituye try-with-resources para administrar archivos.
            System.out.println("Intento terminado.");
        }
    }

    static void registrarNota(int nota) {
        if (nota < 0 || nota > 10) {
            // throw informa al llamador que no se cumple la precondición.
            throw new IllegalArgumentException("La nota debe estar entre 0 y 10.");
        }
        System.out.println("Nota registrada: " + nota);
    }
}
