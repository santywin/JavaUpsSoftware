package curso.avanzado.capitulo07;

// Arreglos (arrays).
public class C07E01Arreglos {
    public static void main(String[] args) {
        // Un arreglo almacena varios valores de un mismo tipo.
        // Su longitud queda fija al crearlo.
        int[] notas = {8, 9, 7};

        // Los índices empiezan en 0: aquí los válidos son 0, 1 y 2.
        System.out.println("Primera nota: " + notas[0]);
        notas[1] = 10; // Cambia el segundo elemento.

        int suma = 0;
        // length es la cantidad de elementos. Se usa <, no <=.
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota en índice " + i + ": " + notas[i]);
            suma += notas[i];
        }

        // El arreglo de este ejemplo tiene tres elementos, nunca está vacío.
        double promedio = (double) suma / notas.length;
        System.out.println("Promedio: " + promedio);

        // for-each facilita leer los valores cuando no necesitamos el índice.
        for (int nota : notas) {
            System.out.println("Valor: " + nota);
        }
    }
}
// notas[3] produciría un error: esa posición no existe.
