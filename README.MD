# Gilded Rose Refactorized - David Jhonatan Sandoval Garcia

Este repositorio es la solución al ejercicio práctico de 
refactorización del código "Gilded Rose", la cual se encuentra desarrollada en lenguaje Java

El proyecto cuenta con dos clases donde se encuentra el código Gilded Rose

- ##### OriginalGildedRose
- ##### GildedRose

## OriginalGildedRose
Contiene el código original del [reposotorio de Gilded Rose](https://github.com/emilybache/GildedRose-Refactoring-Kata)

## GildedRose 
Es el resultado de factorizar el código y aplicar patrones de diseño 
al código de la clase OriginalGildedRose, además es en esta clase donde 
se implementa el nuevo requerimiento que se detalla en los [requerimientos del repositorio Gilded Rose](DETAILS.md) 
el cual es implementar la actualizacion de la calidad para los items de tipo "Conjured".

Entre los cambios que se hicieron para la refactorización del código se encuentran:

- Se cambio el for que se utilizaba para recorrer la lista de items por un foreach.
- Se añadieron variables constantes para identificar a los diferentes tipos de items
que se encuentran en la lista, estas variables son: AGED_BRIE_VALUE, BACKSTAGE_PASS_VALUE,
SULFURAS_VALUE y CONJURED_VALUE.
- Se añadieron constantes para definir el aumento o reducción de la calidad que cada
item recibia por cada día que pasaba.
- Se añadieron constantes para identificar los valores mínimos y maximos para la
calidad de los diferentes items, a excepcion de los items legendarios, estas variables
son: MAX_QUALITY_VALUE_NO_LEGENDARY y MIN_QUALITY_VALUE.

Ademàs, para la resolución del problema se aplicaron los siguientes patrones:

##### Patrón Estrategia (Strategy): 
Para definir las estrategias que se utilizan para actualizar la calidad
de los diferentes items.

##### Patrón Método Plantilla (Template Method)
Para la implementación de las estrategias, esto debido a que el proceso que
se sigue para la actualización de la calidad en los items es bastante parecido
y las pocas diferencias que tienen en su comportamiento, las cuales se detallan en los
[requerimientos](DETAILS.md)), se implementan en métodos las cuales se encuentran
dentro de cada estrategia y se utilizan en el método plantilla.
