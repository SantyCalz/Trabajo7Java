package Ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] palabras = new String[6];

        System.out.println("Ingrese 6 palabras:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            palabras[i] = scanner.nextLine();
        }

        System.out.print("Ingrese una palabra para verificar: ");
        String palabra = scanner.nextLine();

        boolean encontrada = false;
        for (String p : palabras) {
            if (p.equalsIgnoreCase(palabra)) {
                encontrada = true;
                break;
            }
        }

        if (encontrada) {
            System.out.println("La palabra está en el vector.");
        } else {
            System.out.println("La palabra NO está en el vector.");
        }
    }
}
