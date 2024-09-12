package Ejercicio11al14;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase para generar un acrónimo: ");
        String frase = scanner.nextLine();

        String acronimo = ParsearTexto.acronimo(frase);

        System.out.println("Acrónimo: " + acronimo);
    }
}
