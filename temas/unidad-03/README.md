# Unidad 3. Funciones y recursividad

## 3.1 Introducción a clases y objetos

Una clase describe datos y comportamientos. Cada objeto conserva su propio estado. Crea dos fichas de estudiantes antes de añadir conceptos nuevos. Reconoce atributo, constructor y this; no hace falta estudiar herencia en esta asignatura.

## 3.2 Definición de métodos

Los métodos modularizan y permiten reutilizar código. Distingue parámetro de argumento, void de un valor de retorno, y método de instancia de método static. En Java, las funciones de estos ejemplos se escriben como métodos dentro de clases.

## 3.3 Librerías estándar

Usa clases existentes: Scanner lee entrada, Math ofrece cálculos, Random genera valores pseudoaleatorios y String trabaja con texto. import permite usar un nombre corto de clase. Una semilla fija en Random ayuda a repetir una prueba. Deja la sobrecarga como ampliación una vez que entiendas un método sencillo.

## 3.4 Funciones recursivas

Un método recursivo se llama a sí mismo. Necesita un caso base y una llamada que se acerque a él. Traza sumarHasta(3): 3 + sumarHasta(2), luego 2 + sumarHasta(1), luego 1 + sumarHasta(0). El caso base devuelve 0; al regresar se obtienen 1, 3 y 6. Compara factorial con bucle y con recursión; usar recursión no significa que siempre sea la mejor opción.

## Ejemplos

1. [U03E01Objetos](../../src/main/java/curso/unidad03/U03E01Objetos.java)
2. [U03E02Metodos](../../src/main/java/curso/unidad03/U03E02Metodos.java)
3. [U03E03ConversionTemperatura](../../src/main/java/curso/unidad03/U03E03ConversionTemperatura.java)
4. [U03E04SobrecargaYMath](../../src/main/java/curso/unidad03/U03E04SobrecargaYMath.java)
5. [U03E05SumaRecursiva](../../src/main/java/curso/unidad03/U03E05SumaRecursiva.java)
6. [U03E06Factorial](../../src/main/java/curso/unidad03/U03E06Factorial.java)
7. [U03E07ContarParesConMetodo](../../src/main/java/curso/unidad03/U03E07ContarParesConMetodo.java)
8. [U03E08SumaDigitosRecursiva](../../src/main/java/curso/unidad03/U03E08SumaDigitosRecursiva.java)

[Ejercicios](EJERCICIOS.md)

Primero resuelve los ejemplos sencillos. Después usa las prácticas de ampliación; puedes dedicar varias sesiones al mismo tema.
