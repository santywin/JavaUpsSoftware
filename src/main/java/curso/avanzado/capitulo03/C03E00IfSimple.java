package curso.avanzado.capitulo03;

// Una pregunta con dos respuestas posibles.
public class C03E00IfSimple {
    public static void main(String[] args) {
        int puntos = 7;
        // >= pregunta si puntos es mayor o igual a 7. Produce true o false.
        if (puntos >= 7) {
            System.out.println("Meta alcanzada");
        } else {
            System.out.println("Sigue practicando");
        }
        // Esta instrucción está fuera del if: se ejecuta en ambos caminos.
        System.out.println("Fin de la comparación");
    }
}
// Prueba puntos = 6, 7 y 8. ¿En cuál cambia el resultado?
