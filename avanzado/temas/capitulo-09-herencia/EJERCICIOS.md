# Ejercicios propuestos — capítulo 9

Resuelve en archivos nuevos con nombres como `Ejercicio01.java`. Para Java, crea el subpaquete `curso.avanzado.capitulo09.practica` y guarda allí tus ejercicios. Así separas tus soluciones de los ejemplos. El capítulo 1 es conceptual. No cambies los ejemplos resueltos. En IntelliJ, crea el subpaquete con **New → Package** y cada clase con **New → Java Class**. Incluye `public static void main(String[] args)` cuando quieras ejecutarla.

Entrega tu código con una explicación corta y las pruebas que hiciste.

## 1. Subclase

**Nivel:** Inicial

**Enunciado:** Crea Persona con nombre y Docente con materia.

**Comprobación:** La descripción del docente debe incluir nombre y materia.

## 2. Sobrescritura

**Nivel:** Práctica

**Enunciado:** Sobrescribe descripcion e invoca super.descripcion().

**Comprobación:** La salida debe conservar la información de Persona y añadir la del subtipo.

## 3. Encapsulación

**Nivel:** Reto del capítulo

**Enunciado:** Mantén nombre privado y accede a través de un método heredado.

**Comprobación:** El programa debe compilar sin hacer público el atributo.

## Nota sobre las clases auxiliares

En las prácticas, crea tus propias clases en el mismo subpaquete de práctica. Si quieres ampliar directamente una clase auxiliar del ejemplo (como `Entregable`), tu nueva clase debe estar en el paquete original `curso.avanzado.capitulo09`, porque esa clase auxiliar tiene acceso de paquete. Usa nombres distintos para evitar duplicados.
