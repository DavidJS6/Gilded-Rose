# Gilded Rose Refactorized - David Jhonatan Sandoval Garcia

El presente repositorio es la solución al ejercicio práctico de 
refactorización de código "Gilded Rose", la solución está escrita en JAVA.
La clase que contiene el código solución (código completamente refactorizado) 
es la clase [GildedRose.java](src/main/java/com/gildedrose/GildedRose.java)

El proyecto tiene 3 clases en las cuales se puede observar el proceso
de refactorización.

- ##### OriginalGildedRose
- ##### GildedRose

## OriginalGildedRose

Contiene el código original del [reposotorio de Gilded Rose](https://github.com/emilybache/GildedRose-Refactoring-Kata)

## ReadableGildedRose 

Es el resultado de aplicar algunas técnicas de refactorización básica, 
de manera tal que el código quede legible. Las siguientes acciones
realizadas son las más destacables de lo que se hizo durante el
proceso de refactorización:

- Se cambió el for por un foreach
- Se añadió el uso de constantes de tipo String: AGED_BRIE, BACKSTAGE_PASSES
y SULFURAS
- Se añadió el uso de constantes de tipo int: REGULAR_MAX_QUALITY y
MIN_QUALITY
- Se agregaron funciones para identificar los diferentes tipos de items
en función de sus nombres
- Se cambió todas las condicionales que hacían uso de lógica negativa 
a lógica positiva

## GildedRose 
Es el resultado de aplicar patrones de diseño al código de la clase 
ReadableGildedRose, por ende es la solución definitiva, en esta se
implementa también el requerimiento no implementado (pero si definido
en los [requerimientos](REQUIREMENTS.md)) en el código original 
(items de tipo "Conjured").

Para la resolución del problema se aplicaron los siguientes patrones:

##### Patrón Estrategia (Strategy): 
Para definir diferentes estrategias
a utilizar en la actualización de la calidad de los diferentes items.
##### Patrón Fábrica Abstracta (Abstract Factory)
Para crear los diferentes tipos de estrategias.
##### Patrón Método Plantilla (Template Method)
Para la implementción de las estrategias, pues estas en su método 
principal tienen una estructura fija que define los pasos a seguir,
pero cada uno de los pasos debe ser implementado de alguna forma
peculiar para los distintos tipos de items de acuerdo a los
 [requerimientos](REQUIREMENTS.md).