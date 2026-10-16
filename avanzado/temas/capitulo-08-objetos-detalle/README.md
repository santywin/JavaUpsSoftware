# 8. Clases y objetos en detalle

Ahora que ya creamos objetos, vamos a relacionarlos. Un curso puede tener un aula y compartir un contador con otros cursos. Estos ejemplos ayudan a distinguir los datos de cada objeto de los que pertenecen a la clase.

Composición significa que un objeto contiene una referencia a otro: un curso tiene un aula. `static` pertenece a la clase, no a cada instancia. `final` impide reasignar la variable; una referencia final no vuelve inmutable al objeto referido. Un constructor puede delegar en otro usando `this(...)`.

## Ejemplos

1. [C08E01Composicion](../../../src/main/java/curso/avanzado/capitulo08/C08E01Composicion.java)

## Prueba por tu cuenta

Crea otro curso. ¿Qué valores son propios de ese curso y cuál se comparte con los demás?

En [EJERCICIOS.md](EJERCICIOS.md) tienes más problemas para resolver.


## Para consultar

- [02-paquetes](02-paquetes.md)
