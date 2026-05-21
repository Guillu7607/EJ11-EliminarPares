# Resumen
Este proyecto consiste en una aplicación de consola en Java diseñada para realizar el filtrado selectivo de una lista de enteros (List<Integer>). El objetivo principal del ejercicio es aislar los números impares eliminando de forma segura cualquier elemento par mediante la API Iterator, rastreando además cómo se transforma la colección paso a paso en la terminal.

## Características
Detección Aritmética de Pares: Utiliza el operador de residuo o módulo (% 2 == 0) para identificar números que son divisibles exactamente entre dos.

Eliminación Segura sobre el Terreno (In-Place): Implementa el método .remove() de un iterador explícito para purgar elementos sin alterar los punteros de lectura ni lanzar excepciones de modificación concurrente.

Trazabilidad en Tiempo Real: Imprime el estado de la lista directamente dentro del bloque condicional del bucle, permitiendo observar cómo muta la estructura de datos en la memoria RAM cada vez que un elemento par es destruido.
