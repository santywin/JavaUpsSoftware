package curso.avanzado.capitulo04;

// Elegir entre opciones.
public class C04E03Switch {
    public static void main(String[] args) {
        int opcion = 2;

        // switch compara un valor con distintos casos.
        switch (opcion) {
            case 1:
                System.out.println("Elegiste saludar.");
                break; // Sale del switch; evita continuar con el siguiente caso.
            case 2:
                System.out.println("Elegiste ver los ejercicios.");
                break;
            case 3:
                System.out.println("Elegiste salir.");
                break;
            default:
                // Se usa cuando ningún caso coincide.
                System.out.println("Opción desconocida.");
        }
    }
}
// Cambia opcion a 1, 3 y 99. Predice cada resultado antes de ejecutar.
