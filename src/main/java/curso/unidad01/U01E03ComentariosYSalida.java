package curso.unidad01;

// Comentarios y salida en pantalla.

// Este comentario ocupa una línea. Java no lo ejecuta.

/* Este es un comentario

   que ocupa varias líneas. */

public class U01E03ComentariosYSalida {

    public static void main(String[] args) {

        // print escribe sin añadir un salto de línea al final.

        System.out.print("Mi nombre es ");

        System.out.println("Ana");



        // println sin texto deja una línea vacía.

        System.out.println();

        System.out.println("Materias:");



        // \n representa un salto de línea dentro del texto.

        System.out.println("Java\nMatemáticas");



        // Para mostrar comillas dentro de un texto, se escribe \".

        System.out.println("La profesora dijo: \"Practiquen\".");

    }

}

// Piensa antes de ejecutar: ¿cuántas líneas ocupan los nombres de las materias?
