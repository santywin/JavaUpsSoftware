package curso.unidad02;

// Clasificar un número.

public class U02E06PositivoNegativoCero {

    public static void main(String[] args) {

        int numero = -5;

        // Los tres casos se excluyen: solo un bloque debe ejecutarse.

        if (numero > 0) {

            System.out.println("Positivo");

        } else if (numero < 0) {

            System.out.println("Negativo");

        } else {

            System.out.println("Cero");

        }

    }

}
