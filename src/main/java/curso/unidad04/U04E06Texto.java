package curso.unidad04;

// Métodos de String: se usan herramientas existentes antes de crear clases propias.

public class U04E06Texto {

    public static void main(String[] args) {

        String nombre = "  Ana  ";

        String limpio = nombre.trim(); // Devuelve otro texto; no cambia nombre.

        System.out.println("Original: [" + nombre + "]");

        System.out.println("Limpio: [" + limpio + "]");

        System.out.println("Longitud: " + limpio.length());

        System.out.println("Mayúsculas: " + limpio.toUpperCase());

        // equals compara contenido; == no es la comparación de contenido de String.

        System.out.println("¿Es Ana?: " + limpio.equals("Ana"));

        System.out.println("¿Es ana?: " + limpio.equals("ana"));

        System.out.println("Sin distinguir mayúsculas: " + limpio.equalsIgnoreCase("ana"));

    }

}
