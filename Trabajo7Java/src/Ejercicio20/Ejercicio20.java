package Ejercicio20;

public class Ejercicio20 {

    public static void main(String[] args) {
        // Fragmento 1: Sumar valores hasta 500
        int suma = 0;
        int i = 0;  // Inicialización
        while (i < 500) {
            suma = suma + i;
            System.out.println(suma + " " + i);
            i++;  // Incremento
        }

        // Fragmento 2: Contar las sillas con valor 1 en el array
        int[] arraySillas = {1, 0, 1, 1, 0, 0, 1}; // Ejemplo de array
        int sillas = 0;
        int j = 0;  // Inicialización
        while (j < arraySillas.length) {
            if (arraySillas[j] == 1) {
                sillas = sillas + 1;
            }
            j++;  // Incremento
        }
        System.out.println("Número de sillas con valor 1: " + sillas);
    }
}
