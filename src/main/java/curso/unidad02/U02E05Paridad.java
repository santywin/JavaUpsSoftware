package curso.unidad02;

// Determinar si un entero es par.

public class U02E05Paridad {

    public static void main(String[] args) {

        int numero = 14;

        // Un entero es par si al dividir entre 2 el resto es cero.

        if (numero % 2 == 0) {

            System.out.println("Par");

        } else {

            System.out.println("Impar");

        }

    }

}
