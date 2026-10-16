# Ejercicios propuestos — capítulo 10

Resuelve en archivos nuevos con nombres como `Ejercicio01.java`. Para Java, crea el subpaquete `curso.avanzado.capitulo10.practica` y guarda allí tus ejercicios. Así separas tus soluciones de los ejemplos. El capítulo 1 es conceptual. No cambies los ejemplos resueltos. En IntelliJ, crea el subpaquete con **New → Package** y cada clase con **New → Java Class**. Incluye `public static void main(String[] args)` cuando quieras ejecutarla.

Entrega tu código con una explicación corta y las pruebas que hiciste.

## 1. Nueva actividad

**Nivel:** Inicial

**Enunciado:** Añade ProyectoActividad que implemente Entregable.

**Comprobación:** El mismo for de entregas debe poder llamar entregar sin comprobar tipos.

## 2. Figuras

**Nivel:** Práctica

**Enunciado:** Crea una clase abstracta Figura con area y dos subclases: cuadrado y rectángulo. Usa dimensiones positivas.

**Comprobación:** Lado 3: 9; base 3 y altura 5: 15.

## 3. Colección polimórfica

**Nivel:** Reto del capítulo

**Enunciado:** Procesa ambas figuras mediante referencias de tipo Figura.

**Comprobación:** Una sola instrucción figura.area() debe obtener cada resultado.

## Nota sobre las clases auxiliares

En las prácticas, crea tus propias clases en el mismo subpaquete de práctica. Si quieres ampliar directamente una clase auxiliar del ejemplo (como `Entregable`), tu nueva clase debe estar en el paquete original `curso.avanzado.capitulo10`, porque esa clase auxiliar tiene acceso de paquete. Usa nombres distintos para evitar duplicados.
