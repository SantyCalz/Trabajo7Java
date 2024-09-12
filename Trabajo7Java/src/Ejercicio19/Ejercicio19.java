package Ejercicio19;

import java.util.Random;

public class Ejercicio19 {
    public static void main(String[] args) {
        int[][] matriz = new int[6][6];
        Random random = new Random();
        int suma = 0;
        int contador = 0;

        System.out.println("Matriz 6x6:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matriz[i][j] = random.nextInt(100);  // Números aleatorios entre 0 y 99
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 6; i += 2) {  // Filas pares (0, 2, 4)
            for (int j = 0; j < 6; j++) {
                suma += matriz[i][j];
                contador++;
            }
        }

        double promedio = (double) suma / contador;
        System.out.println("Promedio de los números en las filas pares: " + promedio);
    }
}

