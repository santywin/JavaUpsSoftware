package curso.unidad02;

// Aquí vamos a guardar datos, mostrarlos y cambiar un valor.

public class U02E01Variables {

    public static void main(String[] args) {

        // Se lee: crear una variable de texto llamada nombre con el valor Ana.

        String nombre = "Ana";

        // int guarda un número entero. Los números se escriben sin comillas.

        int edad = 17;

        // double permite parte decimal. Dentro del código usamos punto.

        double nota = 8.5;



        // + une el mensaje con el valor guardado en la variable.

        System.out.println("Nombre: " + nombre);

        System.out.println("Edad: " + edad);

        System.out.println("Nota: " + nota);



        // = significa asignar. Guardamos un nuevo valor en una variable existente.

        edad = 18;

        System.out.println("Nueva edad: " + edad);

    }

}

// Piensa antes de ejecutar: ¿se muestra 17 o 18 en la última línea? ¿Por qué?
