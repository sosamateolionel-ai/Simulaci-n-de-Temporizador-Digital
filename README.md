# Temporizador

## Descripción

Este programa implementa una clase `Temporizador` que permite representar un tiempo mediante minutos y segundos. También permite avanzar una determinada cantidad de segundos y actualizar correctamente los minutos cuando los segundos superan los 59.

## Funcionamiento

La clase utiliza dos atributos privados:

* `minutos`: almacena la cantidad de minutos.
* `segundos`: almacena los segundos restantes.

El constructor valida que los minutos no sean negativos y que los segundos estén entre 1 y 59.

La clase contiene los siguientes métodos:

* `avanzarSegundos()`: agrega una cantidad de segundos al temporizador y realiza la conversión correspondiente a minutos y segundos.
* `mostrarTiempo()`: muestra el tiempo en formato `MM:SS`.

## Ejemplo

<img width="360" height="95" alt="image" src="https://github.com/user-attachments/assets/7b29d79f-dbbb-4f94-a631-295ece51c326" />


## Conceptos utilizados

* Clases y objetos
* Encapsulamiento
* Constructores
* Métodos
* Validación de datos
* Condicionales `if`
* Excepciones `IllegalArgumentException`
* División y módulo (`/` y `%`)
* Formato de salida con `printf`
