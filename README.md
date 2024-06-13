# literAlura

**literAlura** es una aplicación de consola que permite gestionar libros y autores, proporcionando funcionalidades como búsqueda de libros, listado de libros y autores registrados, y más.

## Descripción

En este emocionante desafío de programación, he creado mi propio catálogo de libros: **literAlura**. Aprendí a realizar solicitudes a una API de libros, manipular datos JSON, guardarlos en una base de datos y, finalmente, filtrar y mostrar los libros y autores de interés.

## Instalación

Para instalar y ejecutar **literAlura**, sigue estos pasos:

1. Clona el repositorio:
    ```sh
    git clone https://github.com/tu-usuario/literalura.git
    ```
2. Navega al directorio del proyecto:
    ```sh
    cd literalura
    ```
3. Compila el proyecto:
    ```sh
    mvn clean install
    ```
4. Ejecuta la aplicación:
    ```sh
    mvn exec:java -Dexec.mainClass="com.fabianavila.LiterAlura.principal.Principal"
    ```

## Uso

Una vez que la aplicación está en ejecución, verás un menú con las siguientes opciones:

<i class="fas fa-list-alt"></i> **Elija la opción a través de su número:**
- `1` buscar libro por título
- `2` listar libros registrados
- `3` listar autores registrados
- `4` listar autores vivos en un determinado año
- `5` listar libros por idioma
- `0` salir

### Funcionalidades

<i class="fas fa-book"></i> **Buscar libro por título**: Permite buscar un libro por su título utilizando la API de Gutenberg.

<i class="fas fa-list"></i> **Listar libros registrados**: Muestra todos los libros que han sido registrados en el sistema.

<i class="fas fa-user"></i> **Listar autores registrados**: Muestra todos los autores registrados en el sistema junto con sus detalles.

<i class="fas fa-calendar-alt"></i> **Listar autores vivos en un determinado año**: Permite listar autores que estaban vivos en un año específico.

<i class="fas fa-language"></i> **Listar libros por idioma**: Muestra los libros registrados en el sistema filtrados por idioma.

### Ejemplo de uso


- Si seleccionas `1`, se te pedirá ingresar el nombre del libro que deseas buscar.
- Si seleccionas `2`, se mostrarán todos los libros registrados en el sistema.
- Si seleccionas `3`, se mostrarán todos los autores registrados en el sistema.
- Si seleccionas `4`, se te pedirá ingresar un año y se mostrarán los autores que estaban vivos en ese año.
- Si seleccionas `5`, se te pedirá ingresar un idioma y se mostrarán los libros en ese idioma.

## Desarrollo

Los pasos seguidos para completar este desafío fueron:

1. **Configuración del Ambiente Java**: Configuré mi entorno de desarrollo con las herramientas necesarias para programar en Java.
2. **Creación del Proyecto**: Inicialicé un nuevo proyecto en Java.
3. **Consumo de la API**: Realicé solicitudes a la API de libros de Gutenberg.
4. **Análisis de la Respuesta JSON**: Manipulé y analicé los datos JSON recibidos de la API.
5. **Inserción y Consulta en la Base de Datos**: Guardé los datos en una base de datos y realicé consultas para recuperarlos.
6. **Exhibición de Resultados a los Usuarios**: Filtré y mostré los datos de interés a través de la interfaz de consola.
