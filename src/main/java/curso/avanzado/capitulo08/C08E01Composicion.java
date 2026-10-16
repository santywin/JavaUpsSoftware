package curso.avanzado.capitulo08;

public class C08E01Composicion {
    public static void main(String[] args) {
        CursoInicial primero = new CursoInicial("Java", new AulaInicial("A1"));
        CursoInicial segundo = new CursoInicial("Algoritmos");
        primero.mostrar();
        segundo.mostrar();
        System.out.println("Cursos creados: " + CursoInicial.obtenerCantidad());
    }
}

enum ModalidadInicial { PRESENCIAL, VIRTUAL }

class AulaInicial {
    private final String codigo; // Se asigna una vez por objeto.
    AulaInicial(String codigo) { this.codigo = codigo; }
    String obtenerCodigo() { return codigo; }
}

class CursoInicial {
    private static int cantidad = 0; // Compartida por todas las instancias.
    private final String nombre;
    private final AulaInicial aula; // Composición: un curso tiene un aula.
    private final ModalidadInicial modalidad;

    CursoInicial(String nombre) {
        this(nombre, new AulaInicial("Por asignar")); // Invoca otro constructor.
    }

    CursoInicial(String nombre, AulaInicial aula) {
        this.nombre = nombre;
        this.aula = aula;
        this.modalidad = ModalidadInicial.PRESENCIAL;
        cantidad++;
    }

    void mostrar() {
        System.out.println(nombre + " / " + aula.obtenerCodigo() + " / " + modalidad);
    }

    static int obtenerCantidad() { return cantidad; }
}
