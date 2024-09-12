package Ejercicio21;

import java.util.Random;

public class Ejercicio21 {
        public static void main(String[] args) {
            int[][] matriz = new int[20][20];
            Random random = new Random();
            int maximo = Integer.MIN_VALUE;

            System.out.println("Matriz 20x20:");
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    matriz[i][j] = random.nextInt(1000);  // Números aleatorios entre 0 y 999
                    System.out.print(matriz[i][j] + " ");


                    if (matriz[i][j] > maximo) {
                        maximo = matriz[i][j];
                    }
                }
                System.out.println();
            }

            // Mostrar el valor máximo
            System.out.println("El valor máximo de la matriz es: " + maximo);
        }
    }


