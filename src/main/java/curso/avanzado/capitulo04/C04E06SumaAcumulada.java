package curso.avanzado.capitulo04;

// Acumular una suma con while.
public class C04E06SumaAcumulada {
    public static void main(String[] args) {
        int numero = 1;
        int suma = 0; // El acumulador guarda el resultado parcial.
        while (numero <= 100) {
            suma += numero;
            numero++; // El contador hace avanzar el bucle.
        }
        System.out.println("Suma: " + suma); // 5050
    }
}
