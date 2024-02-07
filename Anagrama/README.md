# Función para Verificar Anagramas

Esta función comprueba si dos palabras son anagramas entre sí.

## Uso

La función `sonAnagramas(String palabraUno, String palabraDos)` verifica si las palabras `palabraUno` y `palabraDos` son anagramas. Devuelve `true` si lo son y `false` si no lo son.

## Funcionamiento

1. Convierte las palabras a minúsculas para hacer la comparación insensible a mayúsculas/minúsculas.
2. Convierte las palabras en arreglos de caracteres.
3. Ordena los caracteres en ambos arreglos.
4. Verifica si los arreglos ordenados son iguales.