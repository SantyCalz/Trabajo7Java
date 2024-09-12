package Ejercicio18;

public class Ejercicio18 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        int sumaDiagonal = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    matriz[i][j] = i;
                    sumaDiagonal += matriz[i][j];
                } else {
                    matriz[i][j] = 0;
                }
            }
        }


        System.out.println("Matriz 10x10 con diagonal:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Suma de los elementos de la diagonal: " + sumaDiagonal);
    }
}
