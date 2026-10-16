package curso.unidad02;

// Aquí vamos a realizar operaciones pequeñas antes de pedir datos.

public class U02E02Operadores {

    public static void main(String[] args) {

        int primero = 10;

        int segundo = 3;

        // Los paréntesis hacen el cálculo antes de unirlo con el texto.

        System.out.println("Suma: " + (primero + segundo));

        System.out.println("Resta: " + (primero - segundo));

        System.out.println("Multiplicación: " + (primero * segundo));



        // Entre enteros, / descarta la parte fraccionaria: aquí da 3.

        System.out.println("División entera: " + (primero / segundo));

        // Si un operando es decimal, el resultado puede conservar decimales.

        System.out.println("División decimal: " + (10.0 / 3));

        // % obtiene el resto: 10 dividido entre 3 deja resto 1.

        System.out.println("Resto: " + (primero % segundo));

    }

}

// Primero practica +, - y *. Después compara las dos divisiones.

// No pruebes divisor cero en esta clase; su manejo se estudia más adelante.
