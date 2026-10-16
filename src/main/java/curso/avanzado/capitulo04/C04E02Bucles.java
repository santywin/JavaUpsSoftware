package curso.avanzado.capitulo04;

// Repetir instrucciones.
public class C04E02Bucles {
    public static void main(String[] args) {
        int contador = 1;

        // while comprueba la condición ANTES de cada repetición.
        while (contador <= 3) {
            System.out.println("while: " + contador);
            contador++; // Sin este cambio, la condición seguiría siendo verdadera.
        }

        // for reúne inicio, condición y actualización del contador.
        // int i = 1 se ejecuta una vez; i++ después de cada vuelta.
        for (int i = 1; i <= 3; i++) {
            System.out.println("for: " + i);
        }

        int numero = 5;
        // do-while comprueba la condición DESPUÉS del bloque.
        // Por eso se ejecuta al menos una vez, aunque 5 < 3 sea falso.
        do {
            System.out.println("do-while: " + numero);
            numero++;
        } while (numero < 3); // Aquí sí va punto y coma después de la condición.
    }
}
