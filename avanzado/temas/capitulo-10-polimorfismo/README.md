# 10. Polimorfismo e interfaces

Distintos objetos pueden responder a la misma operación. Por ejemplo, varias actividades pueden entregarse de formas diferentes. Veremos cómo procesarlas juntas sin preguntar el tipo de cada una.

Una referencia de supertipo puede apuntar a un subtipo. La implementación sobrescrita depende del objeto real. Una clase abstracta no puede instanciarse directamente. Una interfaz define un contrato; sus métodos abstractos son públicos, por eso las implementaciones del ejemplo llevan public.

## Ejemplos

1. [C10E01Polimorfismo](../../../src/main/java/curso/avanzado/capitulo10/C10E01Polimorfismo.java)

## Prueba por tu cuenta

Añade una actividad nueva y procésala con el mismo bucle. ¿Qué parte del código necesitaste cambiar?

En [EJERCICIOS.md](EJERCICIOS.md) tienes más problemas para resolver.

