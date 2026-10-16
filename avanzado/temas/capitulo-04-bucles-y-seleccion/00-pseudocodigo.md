# Planificar antes de escribir Java

Ejemplo con centinela:

```text
Inicializar suma y cantidad en cero
Leer nota
Mientras nota sea distinta de -1
    Si la nota está entre 0 y 10
        Acumular nota e incrementar cantidad
    Leer otra nota
Si cantidad es mayor que cero
    Mostrar suma dividida entre cantidad
Si no
    Explicar que faltan datos
```

Traza a mano las entradas 8, 6, -1: después del primer dato suma=8 y cantidad=1; después del segundo suma=14 y cantidad=2. El -1 no se suma. Resultado: 7.0. Si la primera entrada es -1, no se divide.
