# Ejercicios propuestos — capítulo 11

Resuelve en archivos nuevos con nombres como `Ejercicio01.java`. Para Java, crea el subpaquete `curso.avanzado.capitulo11.practica` y guarda allí tus ejercicios. Así separas tus soluciones de los ejemplos. El capítulo 1 es conceptual. No cambies los ejemplos resueltos. En IntelliJ, crea el subpaquete con **New → Package** y cada clase con **New → Java Class**. Incluye `public static void main(String[] args)` cuando quieras ejecutarla.

Entrega tu código con una explicación corta y las pruebas que hiciste.

## 1. Cantidad válida

**Nivel:** Inicial

**Enunciado:** Solicita un entero entre 1 y 50 hasta que sea válido.

**Comprobación:** Letras, vacío, 0 y 51 deben rechazarse; 1 y 50 aceptarse.

## 2. Nota inválida

**Nivel:** Práctica

**Enunciado:** Un método debe lanzar IllegalArgumentException cuando la nota esté fuera de 0 a 10.

**Comprobación:** -1 y 11: excepción capturada; 0 y 10: aceptados.

## 3. División segura

**Nivel:** Reto del capítulo

**Enunciado:** Pide enteros y gestiona divisor cero y texto no numérico.

**Comprobación:** 10/2: 5; 10/0 y letras: mensaje útil sin terminar con una traza.
