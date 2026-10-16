# 11. Excepciones y validación

Hasta aquí hemos supuesto que se escribe el dato solicitado. Ahora veremos qué hacer cuando llega una letra en lugar de un número, un valor fuera de rango o el final de la entrada.

El formato inválido y el valor fuera de rango son problemas diferentes. Captura excepciones específicas. `throw` lanza una excepción; `throws` declara que puede propagarse. `finally` se usa para acciones al salir del bloque en el flujo ordinario. Para recursos cerrables, usa try-with-resources.

## Ejemplos

1. [C11E01Validacion](../../../src/main/java/curso/avanzado/capitulo11/C11E01Validacion.java)
2. [C11E02LanzarExcepciones](../../../src/main/java/curso/avanzado/capitulo11/C11E02LanzarExcepciones.java)

## Prueba por tu cuenta

Prueba letras, una línea vacía y los extremos del rango permitido. El programa debe responder de forma comprensible en cada caso.

En [EJERCICIOS.md](EJERCICIOS.md) tienes más problemas para resolver.


## Para consultar

- [03-recursos](03-recursos.md)
