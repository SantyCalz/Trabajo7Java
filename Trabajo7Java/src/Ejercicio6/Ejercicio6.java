package Ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la longitud de la base: ");
        int base = entrada.nextInt();

        for (int i = 1; i <= base; i += 2) {
            for (int j = 0; j < i; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }
}
