# Unidad 4. Manejo de arreglos

## 4.1 Arreglos unidimensionales

Un arreglo reúne valores de un tipo. Sus índices empiezan en cero y terminan en length - 1. Recorre, modifica y busca valores. Para hallar un máximo usa el primer valor del arreglo no vacío, especialmente si todos son negativos.

## 4.2 Arreglos bidimensionales

Usa un índice de fila y otro de columna. Cada fila es otro arreglo; consulta su propia longitud. Empieza sumando filas antes de calcular promedios o totales por columna.

## 4.3 Algoritmos de ordenamiento

Implementa burbuja y selección sin delegar la tarea a Arrays.sort. En burbuja se intercambian vecinos; en selección se busca el mínimo pendiente. Traza {3, 1, 2}: burbuja compara 3/1 y 3/2; tras esa pasada queda {1, 2, 3}. En selección, el primer intercambio coloca el 1 al inicio. Ambos algoritmos tienen coste cuadrático en el peor caso; aquí interesa comprender sus pasos.

## 4.4 Cadena de caracteres

Practica length(), charAt(), trim(), equals() y equalsIgnoreCase(). String no se modifica en el lugar: sus métodos devuelven resultados. Un arreglo usa length sin paréntesis; String usa length(). El contador de vocales del ejemplo limita su alcance a vocales sin tilde.

## Ejemplos

1. [U04E01Arreglos](../../src/main/java/curso/unidad04/U04E01Arreglos.java)
2. [U04E02BuscarMayor](../../src/main/java/curso/unidad04/U04E02BuscarMayor.java)
3. [U04E03Matrices](../../src/main/java/curso/unidad04/U04E03Matrices.java)
4. [U04E04Burbuja](../../src/main/java/curso/unidad04/U04E04Burbuja.java)
5. [U04E05Seleccion](../../src/main/java/curso/unidad04/U04E05Seleccion.java)
6. [U04E06Texto](../../src/main/java/curso/unidad04/U04E06Texto.java)
7. [U04E07ContarVocales](../../src/main/java/curso/unidad04/U04E07ContarVocales.java)
8. [U04E08BusquedaLineal](../../src/main/java/curso/unidad04/U04E08BusquedaLineal.java)
9. [U04E09InvertirArreglo](../../src/main/java/curso/unidad04/U04E09InvertirArreglo.java)
10. [U04E10Columnas](../../src/main/java/curso/unidad04/U04E10Columnas.java)

[Ejercicios](EJERCICIOS.md)

Primero resuelve los ejemplos sencillos. Después usa las prácticas de ampliación; puedes dedicar varias sesiones al mismo tema.
