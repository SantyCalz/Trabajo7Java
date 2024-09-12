package Ejercicio11al14;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        String fraseSoloLetras = ParsearTexto.soloLetras(frase);

        System.out.println("Frase solo con letras: " + fraseSoloLetras);
    }

}
