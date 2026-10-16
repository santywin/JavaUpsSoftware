package curso.unidad04;

public class U04E07ContarVocales {
    public static void main(String[] args) {
        String texto = "Java desde cero";
        System.out.println("Vocales: " + contarVocales(texto));
    }

    // Contamos a, e, i, o, u sin tildes; el texto de entrada no debe ser null.
    static int contarVocales(String texto) {
        int cantidad = 0;
        String minusculas = texto.toLowerCase(java.util.Locale.ROOT);
        for (int i = 0; i < minusculas.length(); i++) {
            char letra = minusculas.charAt(i); // Una posición del texto.
            if (letra == 'a' || letra == 'e' || letra == 'i'
                    || letra == 'o' || letra == 'u') {
                cantidad++;
            }
        }
        return cantidad;
    }
}
