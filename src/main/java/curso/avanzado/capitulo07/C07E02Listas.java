package curso.avanzado.capitulo07;

// Listas que pueden crecer.
import java.util.ArrayList;

public class C07E02Listas {
    public static void main(String[] args) {
        // ArrayList cambia de tamaño al agregar o eliminar elementos.
        // <String> indica que esta lista guardará textos.
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Marta");

        System.out.println("Cantidad: " + nombres.size());
        System.out.println("Primero: " + nombres.get(0));

        nombres.set(1, "Pedro"); // Reemplaza el elemento en el índice 1.
        nombres.remove("Marta"); // Elimina la primera coincidencia por contenido.

        for (String nombre : nombres) {
            System.out.println("Estudiante: " + nombre);
        }

        System.out.println("¿Está Ana?: " + nombres.contains("Ana"));
        System.out.println("¿Lista vacía?: " + nombres.isEmpty());
        // En una lista de números se usa Integer en vez del primitivo int:
        ArrayList<Integer> edades = new ArrayList<>();
        edades.add(15);
        System.out.println("Edad guardada: " + edades.get(0));
    }
}
