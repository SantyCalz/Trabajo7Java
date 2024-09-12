package Ejercicio11al14;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        String fraseModificada = ParsearTexto.chauEspacios(frase);

        System.out.println("Frase modificada: " + fraseModificada);
    }
}
