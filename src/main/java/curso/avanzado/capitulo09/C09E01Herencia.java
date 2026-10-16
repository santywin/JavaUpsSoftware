package curso.avanzado.capitulo09;

public class C09E01Herencia {
    public static void main(String[] args) {
        EstudianteHerencia estudiante = new EstudianteHerencia("Ana", "Java");
        System.out.println(estudiante.descripcion());
    }
}

class PersonaHerencia {
    private String nombre; // La subclase no accede directamente a este atributo.
    PersonaHerencia(String nombre) { this.nombre = nombre; }
    String descripcion() { return "Nombre: " + nombre; }
}

// Relación es-un: un estudiante es una persona.
class EstudianteHerencia extends PersonaHerencia {
    private String curso;
    EstudianteHerencia(String nombre, String curso) {
        super(nombre); // Inicializa primero la parte de la superclase.
        this.curso = curso;
    }

    @Override // El compilador comprueba que sobrescribimos un método heredado.
    String descripcion() {
        return super.descripcion() + ", curso: " + curso;
    }
}
