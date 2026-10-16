package curso.unidad03;

// Dividir el programa en métodos.

public class U03E02Metodos {

    public static void main(String[] args) {

        // Llamar un método es pedirle que ejecute sus instrucciones.

        saludar("Ana"); // "Ana" es el argumento de esta llamada.

        saludar("Luis");



        int resultado = sumar(4, 6);

        System.out.println("Suma: " + resultado);

        System.out.println("¿8 es par?: " + esPar(8));

    }



    // static permite llamar estos métodos desde main sin crear un objeto.

    // void significa que este método no devuelve un valor.

    // nombre es un parámetro: recibe el dato de cada llamada.

    static void saludar(String nombre) {

        System.out.println("Hola, " + nombre);

    }



    // int indica el tipo de dato que este método devuelve.

    static int sumar(int a, int b) {

        return a + b; // Devuelve el resultado y termina el método.

    }



    static boolean esPar(int numero) {

        return numero % 2 == 0;

    }

}
