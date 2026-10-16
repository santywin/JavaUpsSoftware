# Abrir el curso en IntelliJ IDEA

1. Extrae el ZIP completo en una carpeta nueva. No abras archivos dentro del ZIP.
2. En IntelliJ IDEA elige **File → Open** (o **Open** en la pantalla inicial).
3. Selecciona el archivo **pom.xml** de esta carpeta.
4. Si pregunta, elige **Open as Project**. Si solicita confianza, revisa la carpeta y confía en este proyecto para habilitar la compilación.
5. Espera a que termine la importación de Maven. La primera vez puede necesitar Internet para descargar sus herramientas.
6. Si falta Java: abre **File → Project Structure → Project → SDK → Download JDK**, descarga un JDK **21** y selecciónalo como SDK. Si ya tienes JDK 21, úsalo.
7. Abre `src → main → java → curso → capitulo02 → C02E00UnMensaje`.
8. Pulsa el triángulo verde junto a `main` y selecciona **Run**. Debe mostrar `Hola, estoy aprendiendo Java`.

Para los ejemplos que piden datos, escribe en la consola **Run** y pulsa Enter. Cada clase tiene su propio `main`: ejecuta la que corresponda al tema.

## Si algo no aparece

- **No aparece el triángulo verde:** comprueba que abriste el `pom.xml` como proyecto, que el SDK es un JDK y que terminó la importación.
- **No se reconoció Maven:** clic derecho en `pom.xml` → **Add as Maven Project**. Después usa el botón de recarga de la ventana Maven.
- **Error sobre release 21:** selecciona JDK 21 tanto en Project SDK como en el JDK del importador de Maven si este sigue usando otro. Busca “Maven Importing” en Settings.
- **Muchas carpetas repetidas:** extrae este ZIP en una carpeta nueva y abre solo su `pom.xml`.

No hace falta crear un proyecto vacío, mover archivos ni marcar carpetas de código manualmente. IntelliJ IDEA incluye integración con Maven; no necesitas instalar Maven por separado para importarlo desde el IDE.

Documentación de referencia: https://www.jetbrains.com/help/idea/import-project-or-module-wizard.html
