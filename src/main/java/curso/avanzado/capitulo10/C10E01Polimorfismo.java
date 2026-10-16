package curso.avanzado.capitulo10;

public class C10E01Polimorfismo {
    public static void main(String[] args) {
        // Las referencias comparten un tipo; los objetos concretos son distintos.
        ActividadBase[] actividades = {new LecturaActividad(), new PracticaActividad()};
        for (ActividadBase actividad : actividades) {
            // Java elige la implementación del objeto real durante la ejecución.
            System.out.println(actividad.descripcion());
        }
        Entregable[] entregas = {new PracticaActividad(), new CuestionarioActividad()};
        for (Entregable entrega : entregas) {
            entrega.entregar(); // La interfaz define una operación común.
        }
    }
}

abstract class ActividadBase {
    // No se puede crear new ActividadBase(); las subclases completan este método.
    abstract String descripcion();
}

interface Entregable {
    void entregar(); // Los métodos de este contrato son públicos.
}

class LecturaActividad extends ActividadBase {
    @Override
    String descripcion() { return "Leer una explicación breve"; }
}

class PracticaActividad extends ActividadBase implements Entregable {
    @Override
    String descripcion() { return "Programar un ejercicio"; }
    @Override
    public void entregar() { System.out.println("Práctica entregada"); }
}

class CuestionarioActividad implements Entregable {
    @Override
    public void entregar() { System.out.println("Cuestionario entregado"); }
}
