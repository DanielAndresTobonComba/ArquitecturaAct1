## Buenos días, profesor. En este repositorio cuento con tres ejemplos en código que emplean los patrones arquitectónicos MVC, Capas y el Patrón Hexagonal. Cada código cuenta con su explicación en este archivo README. Los otros dos patrones (Enfocado al Dominio - MVP: Modelo Vista Presentador) no poseen ejemplos en código, pero sí incluyen gráficas de funcionamiento y el mismo contenido teórico que los demás modelos. Muchas gracias.

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


# Patron N2

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


# Patron N3
# Patrón de Diseño de Capas 

## Introducción

El **Patrón de Diseño de Capas** es un patrón arquitectónico ampliamente utilizado en el desarrollo de software. Este patrón organiza la aplicación en capas, cada una con responsabilidades específicas, lo que facilita la separación de preocupaciones, la escalabilidad y el mantenimiento del sistema.

## ¿Qué es el Patrón de Diseño de Capas?

El Patrón de Diseño de Capas estructura una aplicación dividiendo su funcionalidad en diferentes niveles o capas. Cada capa tiene una responsabilidad bien definida y se comunica solo con las capas adyacentes. Las capas más comunes incluyen la presentación, la lógica de negocio, el acceso a datos y la base de datos.

### Componentes Principales

- **Capa de Presentación:**
  - Responsable de la interacción con el usuario.
  - Maneja la lógica de la interfaz de usuario (UI) como controladores, vistas o interfaces gráficas.
  - Se comunica con la capa de lógica de negocio para obtener y mostrar los datos necesarios.

- **Capa de Lógica de Negocio:**
  - Contiene las reglas de negocio y la lógica principal de la aplicación.
  - Actúa como intermediario entre la capa de presentación y la capa de acceso a datos.
  - Procesa las operaciones solicitadas por la capa de presentación y delega la persistencia a la capa de acceso a datos.

- **Capa de Acceso a Datos:**
  - Gestiona la persistencia y recuperación de datos.
  - Contiene repositorios o servicios de acceso a datos que realizan operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en la base de datos.
  - Proporciona una abstracción sobre el acceso a la base de datos para la capa de lógica de negocio.

- **Capa de Base de Datos:**
  - Interactúa directamente con la base de datos.
  - Incluye la configuración de la base de datos, esquemas, y scripts SQL.
  - Encapsula las interacciones físicas con la base de datos.

### Ventajas

- **Separación de responsabilidades:** Cada capa tiene una función específica, lo que mejora la organización del código y facilita la localización de problemas.
- **Facilidad de mantenimiento:** Cambios en una capa suelen tener un impacto mínimo en las demás, lo que reduce el riesgo de errores al modificar el código.
- **Reutilización de código:** Las capas como la de acceso a datos y la lógica de negocio pueden ser reutilizadas en diferentes interfaces de usuario.
- **Escalabilidad:** Permite escalar la aplicación fácilmente, ya sea horizontalmente (agregando más servidores) o verticalmente (mejorando el hardware).

### Desventajas

- **Complejidad:** Introduce capas adicionales, lo que puede aumentar la complejidad del sistema, especialmente en aplicaciones simples.
- **Rendimiento:** Puede haber una ligera sobrecarga en el rendimiento debido a las múltiples capas de abstracción.
- **Rigidez:** A veces, puede ser difícil modificar o extender la funcionalidad de una capa sin afectar a las capas adyacentes.

### Cuándo Usarla

- **Aplicaciones empresariales:** Ideal para sistemas de gran tamaño con múltiples módulos y funcionalidades complejas.
- **Proyectos a largo plazo:** Adecuado para proyectos donde la mantenibilidad y la escalabilidad son prioritarias.
- **Sistemas modulares:** Útil cuando se necesita un diseño modular que permita cambios y extensiones en partes específicas del sistema sin afectar a otras.

# Patron N4 
## Patrón de Diseño Enfocado al Dominio (Domain-Driven Design, DDD).

## Introducción

El **Domain-Driven Design (DDD)** es un enfoque de desarrollo de software que se centra en modelar el núcleo de la aplicación basándose en el dominio del problema. Introducido por Eric Evans en su libro "Domain-Driven Design: Tackling Complexity in the Heart of Software", DDD se utiliza principalmente en proyectos complejos donde es crucial capturar y reflejar fielmente las reglas de negocio y las interacciones del dominio.

## ¿Qué es el Diseño Enfocado al Dominio?

El Diseño Enfocado al Dominio (DDD) organiza la estructura y el desarrollo de un proyecto alrededor del dominio y la lógica de negocio. DDD promueve una colaboración cercana entre desarrolladores y expertos en el dominio para asegurar que el modelo de software refleje con precisión el mundo real y las reglas del negocio.

### Componentes Principales

- **Entidades:**
  - Objetos que tienen una identidad única en el sistema.
  - Representan cosas del dominio que persisten a lo largo del tiempo y que pueden cambiar su estado.

- **Value Objects (Objetos de Valor):**
  - Objetos que no tienen identidad única.
  - Son definidos por sus atributos y se consideran inmutables.

- **Agregados:**
  - Conjuntos de objetos relacionados que se tratan como una unidad para la consistencia de datos.
  - Tienen una entidad raíz que controla el acceso a los demás objetos dentro del agregado.

- **Repositorios:**
  - Se encargan de la persistencia y recuperación de agregados.
  - Proporcionan una abstracción sobre las operaciones de base de datos, permitiendo que el código del dominio no se vea afectado por los detalles de la persistencia.

- **Servicios de Dominio:**
  - Contienen lógica de negocio que no encaja naturalmente dentro de ninguna entidad o agregado.
  - Son operaciones del dominio que pueden involucrar varias entidades o agregados.

- **Fábricas:**
  - Encargadas de la creación de objetos complejos, especialmente agregados, asegurando que se construyan de manera consistente.

- **Eventos de Dominio:**
  - Representan hechos importantes que han ocurrido en el dominio.
  - Pueden ser utilizados para desencadenar acciones dentro o fuera del sistema.


### Representación gráfica

![Patron enfocado al dominio](/IMGS/Patron-Dominio.png)

### Ventajas

- **Modelo de dominio rico:** Permite capturar de manera detallada y precisa las reglas y comportamientos del dominio.
- **Enfoque colaborativo:** Fomenta una estrecha colaboración entre los desarrolladores y los expertos en el dominio, asegurando que el software cumpla con las expectativas del negocio.
- **Escalabilidad:** Facilita la gestión de la complejidad en sistemas grandes y evolutivos.
- **Consistencia:** Asegura la consistencia del dominio al organizar y proteger la lógica del negocio dentro de los agregados.

### Desventajas

- **Complejidad:** Puede ser excesivamente complejo para proyectos pequeños o donde el dominio no es muy complicado.
- **Curva de aprendizaje:** Requiere una comprensión profunda del dominio y puede necesitar más tiempo de desarrollo inicial.
- **Requiere colaboración intensa:** Depende en gran medida de la disponibilidad y el conocimiento de los expertos en el dominio.

### Cuándo Usarla

- **Dominios complejos:** Ideal para proyectos donde el dominio del problema es complicado y evoluciona con el tiempo.
- **Aplicaciones empresariales:** Adecuado para sistemas grandes que requieren una lógica de negocio sofisticada.
- **Proyectos con larga vida útil:** Recomendado para proyectos que se mantendrán y evolucionarán durante un largo período.


# Patron N5 

# Patrón Model-View-Presenter (MVP).

## Introducción

El **Patrón Model-View-Presenter (MVP)** es un patrón arquitectónico que separa la lógica de presentación de la interfaz de usuario (UI), permitiendo una mejor organización del código y facilitando su testeo y mantenimiento. MVP es una evolución del patrón Model-View-Controller (MVC) y es comúnmente utilizado en aplicaciones con interfaces gráficas (GUIs), especialmente en entornos donde es importante desacoplar la lógica de presentación de la UI, como en aplicaciones móviles o de escritorio.

## ¿Qué es el Patrón Model-View-Presenter?

El patrón MVP divide una aplicación en tres componentes principales: Modelo (Model), Vista (View) y Presentador (Presenter). Cada uno tiene una responsabilidad clara:

### Componentes Principales

- **Model (Modelo):**
  - Representa los datos y la lógica de negocio de la aplicación.
  - Maneja el acceso a datos, como consultas a bases de datos, y las reglas de negocio.
  - No tiene conocimiento de la vista ni del presentador.

- **View (Vista):**
  - Es la interfaz de usuario que muestra los datos al usuario y captura las entradas.
  - Se comunica con el presentador para realizar acciones, pero no contiene lógica de negocio.
  - Debe ser lo más simple posible, enfocándose en la presentación de datos.

- **Presenter (Presentador):**
  - Actúa como intermediario entre la vista y el modelo.
  - Recibe la entrada de la vista, la procesa (a veces usando el modelo), y actualiza la vista en consecuencia.
  - Contiene la lógica de presentación, pero no realiza directamente operaciones sobre la vista ni maneja datos directamente.

### Flujo de Trabajo

1. El **usuario** interactúa con la **View**.
2. La **View** notifica al **Presenter** sobre la acción del usuario.
3. El **Presenter** invoca la lógica del **Model** para procesar los datos o realizar operaciones.
4. El **Model** devuelve los datos procesados al **Presenter**.
5. El **Presenter** actualiza la **View** con los nuevos datos.

![Patron MVP](/IMGS/mvp-patron.png)


### Ventajas

- **Separación de responsabilidades:** MVP desacopla la lógica de presentación de la UI, lo que facilita el mantenimiento y la prueba del código.
- **Facilidad de testeo:** Como la lógica de presentación está separada de la vista, los presenters pueden ser testeados unitariamente sin necesidad de interactuar con la UI.
- **Reusabilidad:** Las vistas y los presenters pueden ser reutilizados o modificados de forma independiente.

### Desventajas

- **Complejidad adicional:** Introduce un componente adicional (el presenter), lo que puede aumentar la complejidad en proyectos pequeños o simples.
- **Sobreacoplamiento:** A veces, los presenters pueden volverse demasiado complejos si manejan demasiada lógica o si intentan controlar demasiadas vistas.

### Cuándo Usarla

- **Aplicaciones con interfaces de usuario complejas:** Cuando la UI tiene mucha lógica de presentación, MVP ayuda a mantener el código organizado.
- **Aplicaciones donde la testabilidad es clave:** MVP facilita la creación de tests unitarios para la lógica de presentación.
- **Proyectos donde la UI cambia frecuentemente:** MVP permite modificar la vista sin afectar la lógica de presentación o el modelo.



