# Símbolos y palabras para las primeras clases

| Escritura | Cómo leerla en estos ejemplos |
| --- | --- |
| `"Hola"` | Texto literal: se muestran las palabras entre comillas |
| `17` | Número entero; se escribe sin comillas |
| `8.5` | Número decimal; en el código se usa punto |
| `;` | Termina una instrucción como una asignación o llamada |
| `{` y `}` | Abren y cierran un bloque de instrucciones |
| `(` y `)` | Agrupan operaciones, argumentos o una condición |
| `//` | Inicia un comentario de una línea que Java no ejecuta |
| `=` | Asigna un valor: `edad = 18` guarda 18 en edad |
| `==` | Pregunta si dos valores primitivos son iguales |
| `!=` | Pregunta si dos valores primitivos son diferentes |
| `>`, `<`, `>=`, `<=` | Mayor, menor, mayor o igual, menor o igual |
| `+` | Suma números o une texto con otros valores |
| `++` | Incrementa en uno, como `numero = numero + 1` |
| `+=` | Acumula, como `suma = suma + nota` |
| `String` | Tipo que usamos para texto |
| `int` | Tipo para enteros dentro de su rango |
| `double` | Tipo para valores numéricos que pueden tener decimales |
| `boolean` | Tipo con dos valores: `true` y `false` |
| `if / else` | Si se cumple una condición / en caso contrario |
| `while` | Mientras se cumpla la condición, repetir |

No memorices toda la tabla el primer día: consulta solo el símbolo que aparece en tu ejemplo. Las comparaciones de texto se explican después usando `equals`, porque `==` no compara su contenido.

## Errores normales al empezar

- Java distingue `System` de `system` y `String` de `string`.
- `System.out.println("edad")` muestra la palabra edad; sin comillas muestra el valor de la variable.
- Si abres una comilla o una llave, necesitas cerrarla.
- No pongas un punto y coma entre `if (...)` o `while (...)` y su bloque.
- Al escribir un número en el código usa los dígitos, sin separadores de miles.
