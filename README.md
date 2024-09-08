# ACT1

## PATRON N1

## Patrón de Diseño MVC (Modelo-Vista-Controlador)

Este documento describe el patrón de diseño **Modelo-Vista-Controlador (MVC)**, cómo funciona, sus ventajas, desventajas, y cuándo es recomendable utilizarlo.

## ¿Qué es el Patrón MVC?

El patrón **Modelo-Vista-Controlador (MVC)** es una arquitectura que separa una aplicación en tres componentes principales: el **Modelo**, la **Vista**, y el **Controlador**. Este patrón permite organizar el código de manera modular, facilitando su mantenimiento y escalabilidad.

### Componentes del MVC

1. **Modelo**:
   - **Definición**: Representa la lógica de negocio y la estructura de datos de la aplicación.
   - **Función**: Gestiona los datos, interactúa con la base de datos, realiza cálculos y aplica las reglas de negocio.
   - **Ejemplo**: En una aplicación de tienda en línea, el Modelo podría ser una clase `Producto` que representa un artículo con atributos como nombre, precio y cantidad en stock.

2. **Vista**:
   - **Definición**: Es la interfaz de usuario, es decir, lo que el usuario ve e interactúa.
   - **Función**: Presenta los datos del Modelo en un formato adecuado para el usuario (HTML, JSON, XML, etc.).
   - **Ejemplo**: En la tienda en línea, la Vista podría ser una página HTML que muestra una lista de productos disponibles.

3. **Controlador**:
   - **Definición**: Actúa como intermediario entre el Modelo y la Vista.
   - **Función**: Recibe las entradas del usuario a través de la Vista, procesa esas entradas, y selecciona la Vista adecuada para presentar la respuesta.
   - **Ejemplo**: En la tienda en línea, el Controlador podría manejar la lógica cuando un usuario agrega un producto al carrito, actualizando el Modelo (el carrito) y luego redirigiendo a la Vista actualizada.

## Ventajas del MVC

- **Separación de responsabilidades**: Cada componente tiene una responsabilidad clara, lo que facilita el mantenimiento y la escalabilidad.
- **Reutilización de código**: El mismo Modelo puede ser utilizado con diferentes Vistas.
- **Facilita el trabajo en equipo**: Desarrolladores pueden trabajar simultáneamente en el Modelo, la Vista y el Controlador sin interferir unos con otros.
- **Facilidad para realizar pruebas**: La lógica de negocio (Modelo) se puede probar de manera independiente, sin preocuparse por la presentación o la entrada del usuario.

## Desventajas del MVC

- **Complejidad**: Para aplicaciones pequeñas, puede ser excesivo dividir el código en tres componentes separados.
- **Curva de aprendizaje**: Para nuevos desarrolladores, entender y aplicar correctamente el patrón puede ser un desafío.
- **Comunicación entre capas**: En proyectos grandes, la comunicación entre las capas puede volverse compleja y requerir más cuidado para evitar un diseño acoplado.

## Cuándo Usar el MVC

- **Aplicaciones web**: Es ideal para aplicaciones web donde la separación entre la lógica de negocio, la presentación y la gestión de la entrada del usuario es crucial.
- **Proyectos grandes y escalables**: En proyectos que requerirán mantenimiento y ampliaciones a largo plazo, el patrón MVC facilita estas tareas.
- **Aplicaciones con múltiples interfaces**: Si la misma lógica de negocio debe ser accesible desde diferentes interfaces (web, móvil, API), el MVC permite reutilizar el Modelo y el Controlador.

## Cuándo No Usar el MVC

- **Aplicaciones pequeñas y simples**: Para aplicaciones muy simples, el patrón MVC podría añadir una complejidad innecesaria.
- **Proyectos donde la lógica de negocio es mínima o inexistente**: Si casi toda la aplicación es una simple presentación de datos sin lógica de negocio compleja, MVC puede ser excesivo.
- **Requerimientos de alta performance**: En algunas situaciones, la separación estricta de capas puede introducir overhead, y en aplicaciones críticas donde cada milisegundo cuenta, podría no ser la mejor opción.

---

# Arquitectura Hexagonal 

## Introducción

La Arquitectura Hexagonal, también conocida como Arquitectura de Puertos y Adaptadores, es un patrón de diseño que promueve la separación de la lógica de negocio de las interfaces externas. Este patrón fue propuesto por Alistair Cockburn en 2005 con el objetivo de crear aplicaciones mantenibles, flexibles y fáciles de probar.

## ¿Qué es la Arquitectura Hexagonal?

La Arquitectura Hexagonal propone organizar la aplicación de manera que la lógica de negocio esté en el centro, rodeada de "puertos" y "adaptadores" que permiten la comunicación con el mundo exterior.

### Componentes Principales

- **Dominio (Núcleo de la Aplicación):**
  - Contiene la lógica de negocio pura.
  - No depende de ninguna tecnología externa.
  - Aquí se encuentran las entidades, servicios de dominio, y casos de uso.

- **Puertos:**
  - Interfaces que definen las operaciones que el núcleo de la aplicación puede realizar.
  - Existen dos tipos de puertos:
    - **Entrantes (Inbound):** Definen cómo el mundo exterior puede interactuar con la aplicación (por ejemplo, interfaces de servicios).
    - **Salientes (Outbound):** Definen cómo la aplicación interactúa con el mundo exterior (por ejemplo, repositorios o clientes HTTP).

- **Adaptadores:**
  - Implementaciones concretas que conectan los puertos con tecnologías específicas.
  - Ejemplos incluyen controladores web, implementaciones de repositorios, clientes de API externas, etc.

### Ventajas

- **Separación de responsabilidades:** Mantiene la lógica de negocio independiente de las tecnologías externas.
- **Facilidad de prueba:** La lógica de negocio puede ser probada sin la necesidad de depender de infraestructuras externas.
- **Flexibilidad:** Permite cambiar las tecnologías externas (como bases de datos o frameworks de UI) sin afectar el núcleo de la aplicación.

### Desventajas

- **Complejidad:** Introduce una estructura más compleja que puede ser excesiva para aplicaciones pequeñas.
- **Curva de aprendizaje:** Requiere un mayor entendimiento del patrón y puede ser difícil de implementar correctamente.

### Cuándo Usarla

- **Aplicaciones complejas:** Es ideal cuando se espera que la aplicación crezca y se necesite flexibilidad para cambiar tecnologías externas.
- **Entornos con alta volatilidad tecnológica:** Si el entorno tecnológico cambia con frecuencia, la arquitectura hexagonal facilita la adaptación.
- **Proyectos donde la mantenibilidad es clave:** Si la mantenibilidad a largo plazo es una prioridad, este patrón ayuda a mantener el código limpio y desacoplado.

