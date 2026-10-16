# Paquetes en este proyecto Maven

La carpeta de código fuente es `src/main/java`. El paquete `escuela` debe estar en `src/main/java/escuela`, no directamente en `src/escuela`.

En IntelliJ, pulsa con el botón derecho `src/main/java`, elige **New → Package** y escribe `escuela`. Dentro crea **New → Java Class → Saludo**:

```java
package escuela;

public class Saludo {
    public static void main(String[] args) {
        System.out.println("Hola desde un paquete");
    }
}
```

Ejecuta desde el triángulo verde. Con Maven instalado, también puedes usar desde la raíz:

```sh
mvn compile
java -cp target/classes escuela.Saludo
```

`public` permite acceso desde otros paquetes; `private` lo limita a la clase. Sin modificador, el acceso es del paquete. `protected` permite acceso en el paquete y, bajo reglas de herencia, en subclases de otros paquetes. Las clases auxiliares de los ejemplos no son públicas: una práctica en otro paquete debe definir sus propias clases o usar una clase pública apropiada.

No se utiliza `finalize` para cerrar recursos. La recolección de basura y el cierre de archivos son tareas diferentes; el capítulo 11 introduce try-with-resources.
