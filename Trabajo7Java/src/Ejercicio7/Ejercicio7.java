package Ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = entrada.nextLine();

        System.out.println("Letras en posiciones alternadas:");

        for (int i = 0; i < frase.length(); i += 2) {
            System.out.print(frase.charAt(i));
        }
    }
}