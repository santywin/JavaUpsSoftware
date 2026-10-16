package curso.avanzado.capitulo03;

// Encontrar el mayor de tres valores.
public class C03E04MayorDeTres {
    public static void main(String[] args) {
        int primero = 8;
        int segundo = 12;
        int tercero = 12;
        int mayor = primero; // Partimos de un candidato real.
        if (segundo > mayor) {
            mayor = segundo;
        }
        if (tercero > mayor) {
            mayor = tercero;
        }
        // También funciona si todos son negativos o hay empates.
        System.out.println("Mayor: " + mayor);
    }
}
