# 9. Herencia

Un estudiante es una persona y también tiene información propia. La herencia permite expresar esa relación y aprovechar lo que una clase ya sabe hacer. No todas las relaciones entre objetos necesitan herencia.

La herencia modela una relación es-un. `extends` declara la superclase; `super(...)` llama a su constructor. La subclase no accede directamente a sus atributos privados. `@Override` ayuda al compilador a verificar una sobrescritura.

## Ejemplos

1. [C09E01Herencia](../../../src/main/java/curso/avanzado/capitulo09/C09E01Herencia.java)

## Prueba por tu cuenta

Añade una subclase con un dato propio y conserva la información de Persona. Explica por qué elegiste herencia.

En [EJERCICIOS.md](EJERCICIOS.md) tienes más problemas para resolver.

