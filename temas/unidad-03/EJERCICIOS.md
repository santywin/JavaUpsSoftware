# Ejercicios · Unidad 3

Crea tus soluciones en `curso.unidad03.practica`. En IntelliJ usa New → Package y New → Java Class. Cada clase ejecutable necesita main. Para los ejercicios conceptuales, basta una explicación, pseudocódigo o diagrama.

Si amplías una clase auxiliar del ejemplo, trabaja en `curso.unidad03` o define tus propias clases en el subpaquete practica, porque las auxiliares no son públicas.

## 1. Dos objetos

Crea dos fichas y cambia el nombre de una.

**Para comprobar:** La otra conserva su nombre.

## 2. Método de cálculo

Devuelve el mayor de dos enteros.

**Para comprobar:** -3 y -8 → -3; 5 y 5 → 5.

## 3. Temperatura

Escribe un método de Celsius a Fahrenheit.

**Para comprobar:** 0 → 32; 100 → 212; -40 → -40.

## 4. Biblioteca estándar

Usa Math.sqrt y Math.max.

**Para comprobar:** Raíz de 81 → 9.0; máximo de 4 y 7 → 7.

## 5. Suma recursiva

Devuelve la suma de 1 hasta n para n entre 0 y 100.

**Para comprobar:** 0 → 0; 3 → 6; 5 → 15.

## 6. Factorial

Calcula factorial de 0 a 12 con recursión y con bucle.

**Para comprobar:** 0 → 1; 5 → 120; 12 → 479001600.

## 7. Traza de llamadas

Anota llamadas y retornos de factorial(4).

**Para comprobar:** Se llega al caso base y se obtiene 24; explica cómo vuelve el resultado.

Entrega el código y una tabla con entrada, resultado esperado y resultado obtenido. En los primeros ejemplos numéricos se supone una entrada del tipo indicado; la validación de texto es una ampliación posterior.

## 8. Componer métodos

Haz que contarParesHasta use esPar, sin repetir la condición de paridad.

**Para comprobar:** Hasta 7 → 3 pares.

## 9. Dígitos

Suma los dígitos de un entero no negativo de forma recursiva.

**Para comprobar:** 0 → 0; 204 → 6; 999 → 27.

## 10. Potencia recursiva

Calcula base elevada a un exponente entero de 0 a 10; usa valores cuyo resultado quepa en int.

**Para comprobar:** 2^0 → 1; 2^5 → 32. Define base^0 como 1 para el ejercicio.

## 11. Iteración y recursión

Implementa contar hasta cero con bucle y con recursión para entradas de 0 a 10.

**Para comprobar:** Para 3, ambas muestran 3, 2, 1, 0; identifica el caso base.
