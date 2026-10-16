// Las condiciones, bucles y métodos ya se estudiaron en los capítulos anteriores.
package curso.avanzado.capitulo06;

// Una clase pública con main y una clase auxiliar en el mismo archivo.
public class C06E01Objetos {
    public static void main(String[] args) {
        // new crea un objeto. Cada objeto tiene sus propios datos.
        FichaInicial ana = new FichaInicial("Ana", 8.5);
        FichaInicial luis = new FichaInicial("Luis", 7.0);
        ana.saludar();
        luis.saludar();
        ana.establecerNombre("Ana María");
        System.out.println(ana.obtenerNombre());
        System.out.println("Nota: " + ana.obtenerNota());
        luis.saludar(); // Cambiar a Ana no cambió a Luis.
    }
}

class FichaInicial {
    // private protege los datos del acceso directo desde otras clases.
    private String nombre;
    private double nota;

    // Constructor: mismo nombre que la clase, sin tipo de retorno.
    FichaInicial(String nombre, double nota) {
        this.nombre = nombre; // this identifica al objeto actual.
        this.nota = nota;
    }

    void saludar() { // void: no devuelve un valor.
        System.out.println("Hola, soy " + nombre);
    }

    void establecerNombre(String nuevoNombre) { // Recibe un parámetro.
        nombre = nuevoNombre;
    }

    String obtenerNombre() { // Devuelve texto al lugar de la llamada.
        return nombre;
    }

    double obtenerNota() {
        return nota;
    }
}
