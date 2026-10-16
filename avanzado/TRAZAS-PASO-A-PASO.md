# Seguir el programa a mano

## Una condición

Para `puntos >= 7`, completa la predicción antes de ejecutar `C03E00IfSimple`.

| puntos | Resultado de la comparación | Camino |
| --- | --- | --- |
| 6 | false | else |
| 7 | true | if |
| 8 | true | if |

En los tres casos se muestra el mensaje que está fuera de las llaves del if.

## Un bucle

En `C04E00WhileSimple`, numero empieza en 1.

| Comprobación | numero antes | numero <= 3 | Qué ocurre | numero después |
| --- | --- | --- | --- | --- |
| 1 | 1 | true | Muestra 1 e incrementa | 2 |
| 2 | 2 | true | Muestra 2 e incrementa | 3 |
| 3 | 3 | true | Muestra 3 e incrementa | 4 |
| 4 | 4 | false | Sale; no ejecuta el cuerpo | 4 |

## Contador y acumulador

Para las notas 8, 6, -1, la cantidad cuenta notas válidas y suma acumula sus valores.

| Entrada | Se acepta | cantidad | suma |
| --- | --- | --- | --- |
| 8 | Sí | 1 | 8.0 |
| 6 | Sí | 2 | 14.0 |
| -1 | Es el final | 2 | 14.0 |

El promedio es 14.0 / 2 = 7.0. Prueba ahora 11, 8, -1 y explica por qué 11 no cambia suma ni cantidad.
