package curso.unidad02;

// Aplicar una regla de descuento.

public class U02E08Descuento {

    public static void main(String[] args) {

        double compra = 120.0;

        // Primero validamos el dominio del problema.

        if (compra < 0) {

            System.out.println("Compra inválida");

            return; // Termina main: no calculamos un total con una compra negativa.

        }

        double descuento = 0;

        // Regla del ejercicio: 10% desde 100, incluido el valor exacto 100.

        if (compra >= 100) {

            descuento = compra * 0.10;

        }

        System.out.println("Descuento: " + descuento);

        System.out.println("Total: " + (compra - descuento));

        // Para este cálculo sencillo usamos double; un sistema de cobros necesita tratar el dinero con precisión.

    }

}
