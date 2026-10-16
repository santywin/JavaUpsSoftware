# Seguir una llamada

Cuando `main` llama a `area(3)`, Java crea un marco de llamada con el parámetro `lado`. `area` calcula 9 y retorna. Su marco termina y `main` continúa donde hizo la llamada. Cada llamada mantiene sus variables locales.

La sobrecarga se selecciona por los parámetros, no solo por el tipo de retorno. Una conversión de int a double puede hacerse automáticamente; de double a int requiere una conversión explícita y puede perder la parte decimal.
