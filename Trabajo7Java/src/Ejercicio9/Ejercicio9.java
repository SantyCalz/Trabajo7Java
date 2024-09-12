package Ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        System.out.print("Ingrese una letra a reemplazar: ");
        char letra = scanner.next().charAt(0);

        String palabraModificada = palabra.replace(letra, '#');

        System.out.println("Palabra modificada: " + palabraModificada);
    }
}
