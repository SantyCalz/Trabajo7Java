package Ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        System.out.println("Consonantes de la palabra:");
        for (char c : palabra.toCharArray()) {
            if (esConsonante(c)) {
                System.out.println(c);
            }
        }

        String cadenaConsonantes = obtenerConsonantes(palabra);
        System.out.println("Cadena de consonantes: " + cadenaConsonantes);
    }

    public static boolean esConsonante(char c) {
        c = Character.toLowerCase(c);
        return "bcdfghjklmnpqrstvwxyz".indexOf(c) != -1;
    }

    public static String obtenerConsonantes(String palabra) {
        StringBuilder consonantes = new StringBuilder();
        for (char c : palabra.toCharArray()) {
            if (esConsonante(c)) {
                consonantes.append(c);
            }
        }
        return consonantes.toString();
    }
}
