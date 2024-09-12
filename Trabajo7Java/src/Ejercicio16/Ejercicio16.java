package Ejercicio16;

import java.util.Arrays;

public class Ejercicio16 {
    public static void main(String[] args) {
        int[] arreglo = {1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1};

        int[] ordenado = ordenarCerosUnos(arreglo);

        System.out.println("Arreglo ordenado: " + Arrays.toString(ordenado));
    }

    public static int[] ordenarCerosUnos(int[] arreglo) {
        int[] resultado = new int[arreglo.length];
        int indice = 0;

        for (int num : arreglo) {
            if (num == 0) {
                resultado[indice++] = 0;
            }
        }

        while (indice < arreglo.length) {
            resultado[indice++] = 1;
        }

        return resultado;
    }
}
