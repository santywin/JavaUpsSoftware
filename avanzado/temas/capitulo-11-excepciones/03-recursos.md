# Cerrar recursos aunque ocurra una excepción

Una vez que hayas practicado `try/catch`, prueba este fragmento. Requiere tener un archivo `datos.txt` en el directorio desde el que se ejecuta.

```java
try (java.util.Scanner archivo = new java.util.Scanner(new java.io.File("datos.txt"), "UTF-8")) {
    while (archivo.hasNextLine()) {
        System.out.println(archivo.nextLine());
    }
} catch (java.io.FileNotFoundException error) {
    System.out.println("No se encontró datos.txt.");
}
```

El recurso declarado entre paréntesis se cierra al salir del bloque. Inserta el fragmento dentro de `main` para probarlo. No uses un `catch` genérico para ocultar errores desconocidos. Una excepción comprobada exige capturarla o declararla con `throws`; las excepciones derivadas de `RuntimeException`, como `IllegalArgumentException`, no tienen esa exigencia.
