# Tu primer programa

Un programa es una secuencia de instrucciones. En el primer archivo solo mostraremos un mensaje. `main` es el punto de entrada; por ahora usa su estructura tal como está. Las comillas delimitan texto, el punto y coma termina la instrucción y las llaves agrupan bloques. `//` inicia un comentario que Java no ejecuta.

Abre pom.xml en IntelliJ como proyecto y elige JDK 21. Si falta un JDK, usa Download JDK desde Project Structure → Project → SDK. Espera a que Maven cargue el proyecto. No hace falta crear otro proyecto vacío ni mover src.

Ejecuta U01E01UnMensaje y cambia solo el texto entre comillas. Después prueba los ejemplos siguientes. Si aparece un error, lee el primer mensaje y revisa la línea indicada y la anterior.

## Crear un ejercicio

Dentro de src/main/java, crea el paquete `curso.unidad01.practica` y una clase `MiPresentacion`:

```java
package curso.unidad01.practica;

public class MiPresentacion {
    public static void main(String[] args) {
        // Escribe aquí tu solución.
    }
}
```

Agrega una instrucción println para tu nombre y otra para tu meta del semestre. Ejecuta y comprueba las dos líneas. Si IntelliJ ya escribió package, no lo repitas.

No memorices todos los símbolos el primer día. Aprende primero mensajes, luego variables, después teclado y cuentas. Antes de un bucle, asegúrate de entender una condición. No tienes que resolver todos los ejercicios de una vez.
