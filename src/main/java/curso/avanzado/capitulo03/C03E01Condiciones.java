package curso.avanzado.capitulo03;

// Tomar decisiones.
public class C03E01Condiciones {
    public static void main(String[] args) {
        int nota = 8; // Usamos una escala de 0 a 10 para este ejemplo.

        // Una condición produce true o false.
        // Se ejecuta solamente el primer bloque cuya condición sea verdadera.
        if (nota < 0 || nota > 10) { // || significa O: basta que una sea verdadera.
            System.out.println("Nota fuera de la escala.");
        } else if (nota >= 7) {
            System.out.println("Aprobado según la regla de este ejemplo.");
        } else {
            System.out.println("Necesita reforzar.");
        }

        // Comparaciones: == igual, != diferente, > mayor, < menor,
        // >= mayor o igual, <= menor o igual. No confundir == con =.
        int edad = 15;
        boolean tienePermiso = true;

        // && significa Y: ambas condiciones deben ser verdaderas.
        if (edad >= 12 && tienePermiso) {
            System.out.println("Puede participar en la actividad de ejemplo.");
        }

        // ! niega un booleano: !true es false y !false es true.
        if (!tienePermiso) {
            System.out.println("Falta el permiso.");
        }
    }
}
