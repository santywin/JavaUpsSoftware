# JavaUpsSoftware

Fundamentos de Programación · Software · Primer nivel

Ejemplos comentados y ejercicios en Java para comenzar desde cero. El recorrido sigue las cuatro unidades del programa analítico E-CT-ISW-201 de la Universidad Politécnica Salesiana compartido para preparar este material. Es material de práctica; no es una publicación oficial de la universidad.

## Unidades

| Unidad | Tema | Horas totales según el programa |
| --- | --- | --- |
| 1 | [Introducción al lenguaje de programación](temas/unidad-01/README.md) | 48 |
| 2 | [Tipos de datos y estructuras de control](temas/unidad-02/README.md) | 48 |
| 3 | [Funciones y recursividad](temas/unidad-03/README.md) | 48 |
| 4 | [Manejo de arreglos](temas/unidad-04/README.md) | 48 |

Las 192 horas totales del programa se distribuyen en 64 de docencia, 32 de práctica y 96 de trabajo autónomo. Las 48 horas por unidad incluyen el trabajo total, no solo las clases. No se asigna aquí una distribución semanal.

## Para empezar

1. Extrae el ZIP en una carpeta nueva.
2. Abre `pom.xml` como proyecto Maven en IntelliJ IDEA y selecciona JDK 21.
3. Abre `src/main/java/curso/unidad01/U01E01UnMensaje.java`.
4. Pulsa el triángulo verde junto a main. Cambia el mensaje por tu nombre y ejecuta otra vez.

Consulta [PRIMEROS-PASOS.md](PRIMEROS-PASOS.md) si nunca has usado Java. Los programas están en `src/main/java/curso`; las explicaciones y ejercicios, en `temas`. Cada ejemplo se ejecuta por separado. La entrada de teclado se escribe en la consola Run y se confirma con Enter.

Primero trabajamos algoritmos y programas pequeños; después tipos, decisiones y bucles. Clases y objetos se introducen de forma sencilla al empezar la unidad 3, seguidos de métodos, bibliotecas y recursión. La última unidad trata arreglos, matrices, ordenamiento y texto. Herencia, polimorfismo y las demás ampliaciones se mantienen en [Avanzado y práctica adicional](avanzado/README.md).

## Desde la terminal

Con Maven y JDK 21 configurados:

```sh
mvn compile
java -cp target/classes curso.unidad01.U01E01UnMensaje
```

La configuración personal de IntelliJ y los resultados de compilación se excluyen con `.gitignore`. Puedes subir la carpeta completa a tu repositorio.

## Dos recorridos en el mismo proyecto

- **Unidades 1 a 4:** el foco de la asignatura, con más práctica de algoritmos, tipos, condiciones, bucles, métodos, recursividad, arreglos, matrices, ordenamiento y texto.
- **[Avanzado y práctica adicional](avanzado/README.md):** conserva completos los once capítulos previos para repasar y continuar después.

Hay 47 ejemplos en las unidades y 38 en la sección adicional. Los ejercicios se mantienen separados: 46 en las unidades y 43 en los capítulos adicionales. Algunos temas de repaso se repiten a propósito; no es necesario resolverlos todos.

Para dedicar más tiempo al foco del curso, consulta [RUTA-DE-PRACTICA.md](RUTA-DE-PRACTICA.md). El proyecto usa una sola carpeta src y un solo pom.xml.
