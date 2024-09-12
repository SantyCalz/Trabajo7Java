package EjercicioRevision25al32;
/*
25. ¿Qué significa que Java es un lenguaje de programación de alto nivel, orientado a objetos y de propósito general?
- Alto nivel: Java está diseñado para ser fácil de leer y escribir, abstracto de los detalles del hardware.
- Orientado a objetos (OOP): Java se basa en clases y objetos para organizar el código, lo que permite reutilización y modularidad.
- Propósito general: Se puede usar para desarrollar una amplia variedad de aplicaciones (móviles, web, de escritorio, etc.).

Comparación con Python y C++:
- Python: Más fácil de leer, tipado dinámico y más enfocado en la simplicidad. También es multiparadigma (OOP, funcional, etc.).
- C++: Similar a Java en cuanto a ser orientado a objetos, pero ofrece más control a nivel de hardware, como la gestión manual de memoria.

26. Principales características que diferencian a Java de otros lenguajes:
- Portabilidad: "Escribe una vez, corre en cualquier lugar" gracias a la JVM.
- Recolección de basura automática (Garbage Collection): No necesitas gestionar manualmente la memoria.
- Sintaxis estricta: Tipado estático que detecta errores en tiempo de compilación.
- Gran ecosistema: Amplia variedad de bibliotecas, frameworks y herramientas para desarrollo.

27. ¿Qué es el bytecode en Java?
- El bytecode es el código intermedio generado por el compilador de Java. Es independiente del hardware y es ejecutado por la JVM. Permite que las aplicaciones Java sean portables.

28. ¿Qué es la máquina virtual de Java (JVM)? ¿Qué ventajas y desventajas posee?
- La JVM (Java Virtual Machine) es la encargada de ejecutar el bytecode, proporcionando un entorno de ejecución independiente del sistema operativo.

Ventajas:
- Portabilidad: Permite que los programas se ejecuten en cualquier plataforma con una JVM.
- Seguridad: Restringe el acceso al sistema operativo subyacente.
- Optimización: La JVM realiza optimizaciones en tiempo de ejecución (Just-In-Time compilation).

Desventajas:
- Rendimiento: No es tan rápido como el código nativo compilado directamente (como en C++).
- Requiere JVM: Necesitas instalar la JVM en cualquier sistema donde quieras ejecutar Java.

29. ¿Qué son los paquetes en Java? ¿Cuál es su utilidad?
- Los paquetes en Java son agrupaciones de clases relacionadas que facilitan la organización del código. Proveen modularidad y ayudan a evitar conflictos de nombres entre clases.

Ejemplo:
import java.util.Scanner;

30. ¿Cómo se pueden organizar los archivos en un proyecto de Java?
- Un proyecto de Java se organiza utilizando paquetes que corresponden a directorios en el sistema de archivos. Cada paquete contiene clases, y los archivos .java se compilan en archivos .class que son interpretados por la JVM.

Estructura típica de un proyecto:
src/
    com/miempresa/miproyecto/
        Main.java
        OtraClase.java
bin/
    com/miempresa/miproyecto/
        Main.class
        OtraClase.class

31. ¿Qué son las excepciones en Java? ¿Para qué sirven?
- Las excepciones en Java son eventos anormales que ocurren durante la ejecución de un programa y que interrumpen el flujo normal de la ejecución. Permiten manejar errores de manera controlada.

Ejemplo:
try {
    int resultado = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Error: División por cero");
}

Excepciones en Python:
- Las excepciones en Python se manejan de manera similar con bloques try y except. Se utilizan para manejar errores y evitar que el programa se detenga bruscamente.

Ejemplo en Python:
try:
    resultado = 10 / 0
except ZeroDivisionError:
    print("Error: División por cero")

32. Listado de comandos básicos y comparación:

Java:
- public static void main(String[] args): Punto de entrada del programa.
- System.out.println(): Imprimir en pantalla.
- class: Definición de clase.
- new: Crear objetos.
- try-catch: Manejo de excepciones.

C++:
- int main(): Punto de entrada del programa.
- std::cout: Imprimir en pantalla.
- class: Definición de clase.
- new / delete: Manejo de memoria manual.
- try-catch: Manejo de excepciones.

Python:
- No necesita una función main explícita.
- print(): Imprimir en pantalla.
- No usa palabras clave como class o new, pero define clases de forma simple.
- Manejo de excepciones con try-except.
*/

