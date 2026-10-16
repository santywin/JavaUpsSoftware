# Crear mi primer ejercicio en IntelliJ

Después de cambiar y ejecutar el primer mensaje:

1. Dentro de `src/main/java`, localiza `curso.avanzado.capitulo02`.
2. Haz clic derecho en ese paquete y crea un subpaquete con **New → Package**. El nombre completo debe ser `curso.avanzado.capitulo02.practica`.
3. En el subpaquete crea **New → Java Class** y escribe `MiPresentacion`.
4. Completa el archivo con esta estructura:

```java
package curso.avanzado.capitulo02.practica;

public class MiPresentacion {
    public static void main(String[] args) {
        // Escribe aquí las instrucciones de tu solución.
    }
}
```

5. Entre las llaves de main agrega instrucciones `System.out.println(...)` para mostrar tu nombre y una meta, en dos líneas.
6. Ejecuta desde el triángulo de main. Comprueba las dos líneas.

El nombre de la clase debe coincidir con el archivo: `MiPresentacion.java`. No repitas la línea package si IntelliJ ya la agregó. Los ejercicios siguientes usan la misma estructura, cambiando el nombre de clase y las instrucciones de main. No necesitas una solución completa para empezar a ejecutar: puedes escribir una línea y comprobarla.
