
# CIBERSEGURIDAD TALLER 1


PROGRAMA (3.0):

    Se requiere entregar un programa en Java que permita adivinar las contraseñas, y mencione la posición en el archivo rockyou.txt donde se encuentra la palabra clave de la contraseña. 

ANÁLISIS (0.5 cada punto):

    ¿Qué tan fácil fue adivinar las contraseñas? 

    ¿Cuánto tiempo aproximadamente duró el equipo en adivinar las contraseñas? 

    ¿Qué particularidad tienen estas contraseñas? 

    ¿Con base en lo encontrado en este ejercicio, que recomendaciones darías para tener una contraseña segura? 


## Contexto

Hoy recibí un correo de la empresa Pollito con Papas, informando que su base de datos de contraseñas ha sido robada. Temen que un atacante logre descifrar las contraseñas, por lo que nos han pedido que intentemos predecir cuáles se filtraron. De esta manera, podremos evaluar qué tan fáciles son de adivinar y cuánto tiempo tenemos para tomar acciones antes de que un atacante las descifre.

La junta directiva de Pollito con Papas nos ha proporcionado algunas sospechas sobre las contraseñas de los usuarios, y necesitamos confirmar si son correctas.

    Los usuarios están utilizando en sus contraseñas las palabras “pollito”, “papas”, “pollitoconpapas”, “kfc”, “chicken”, “pollo”, “pollocampero” y “apollo” 

    Las contraseñas incluyen años seguidos de un asterisco al final. Esto se debe a que las contraseñas deben contener números y caracteres especiales (Ejemplo: contrasena2024*). Dado que Pollito con Papas fue fundada en 1995, se sospecha que los usuarios están utilizando años entre 1995 y 2025 antes del habitual asterisco (*). 

    Los usuarios están creando contraseñas que incluyen nombres de personas. 

La junta directiva de Pollito con Papas nos solicita lo siguiente:

    Adivinar las contraseñas detrás de los hashes compartidos al final del ejercicio. 

    Verificar si las palabras “pollito”, “papas”, “pollitoconpapas”, “kfc”, “chicken”, “pollo”, “pollocampero” y “apollo” hacen parte de las contraseñas más comunes. 

## Análisis

**1. Complejidad** - Las contraseñas fueron demasiado fáciles de adivinar, pues no presentan una gran complejidad.
Para el fin de descifrar las contraseñas, únicamente fueron necesarios tres ciclos for escritos en aproximadamente 25 
líneas de código (descontando el ciclo for para identificar si las palabras sospechosas se encontraban o no dentro del 
Rockyou). El esfuerzo computacional para la ejecución del programa es mínimo.

**2. Tiempo de ejecución** - Evaluando únicamente el tiempo del ciclo for principal para descifrar 21 hashes (según CPU):
- Ryzen 5 5600G - 160ms aprox.
- Intel Core i3 10G - 375ms aprox.

Estos tiempos pueden evidenciar que el programa no requiere un gran esfuerzo computacional, pues el tiempo de ejecución
es mínimo sin necesidad de un hardware de alta potencia.

**3. Particularidades identificadas** - Las 21 contraseñas comparten el mismo patrón de contener una palabra escrita en
minúsculas, seguida de un año entre 1995 y 2024 y terminada por caracter de asterisco. Aunque todas las palabras que
aparecen en las claves expuestas están dentro de la lista Rockyou, es importante resaltar que 17 de las 21 contraseñas
utilizan el nombre propio de una persona, ya sea de ellos mismos o de algún familiar. Por último se identificó que 6
contraseñas tienen una longitud menor a 12 caracteres.

**4. Recomendaciones de seguridad** - Para mejorar la seguridad de la compañía, es recomendable fortalecer las políticas
de seguridad de las contraseñas, empezando por exigir que las claves sean como mínimo de 12 caracteres, que contengan
mayúsculas, minúsculas y al menos dos caracteres especiales, la compañía podría también tener un programa que verifique
si al momento de cambiar una contraseña la combinación ingresada se encuentra en un archivo ROCKYOU, y rechazar el
cambio hasta que la condición no se cumpla. Por último, la compañía debería exigir a los empleados activar la
autenticación de doble factor para habilitar las funciones de su cuenta, esto reduciría en gran manera el riesgo a la
seguridad, inclusive si se compromete la contraseña de uno de los empleados.

Como tips adicionales para los empleados de la compañía, se
sugiere reemplazar letras por números cuando se forman palabras (por ejemplo, "$3Rg10" o "f3L1pE"), aún más
recomendable sería utilizar combinaciones aleatorias que no formen palabras, esto para evitar utilizar contraseñas
presentes en algún archivo ROCKYOU.

## Estudiantes

- [Felipe Ballesteros](https://github.com/pipe1408)
- [Sergio Socha](https://github.com/sergiosocha)
