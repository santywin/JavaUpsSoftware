package curso.unidad02;

// Conversión automática y conversión explícita.
public class U02E20Conversiones {
    public static void main(String[] args) {
        int cantidad = 7;
        double cantidadDecimal = cantidad; // int a double: conversión automática.
        System.out.println("Como decimal: " + cantidadDecimal);
        double medida = 7.8;
        int parteEntera = (int) medida; // El cast descarta la fracción; no redondea.
        System.out.println("Parte entera: " + parteEntera);
        // Convertir antes de dividir evita la división entera.
        System.out.println("Promedio: " + ((double) cantidad / 2));
        String texto = "25";
        int numero = Integer.parseInt(texto); // Supuesto: texto con un entero válido.
        System.out.println("Texto convertido más uno: " + (numero + 1));
    }
}
