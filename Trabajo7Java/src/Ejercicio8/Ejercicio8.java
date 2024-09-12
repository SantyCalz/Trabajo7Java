package Ejercicio8;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            Random random = new Random();

            System.out.print("Ingrese una frase: ");
            String frase = entrada.nextLine();

            if (frase.length() >= 10) {
                System.out.println("6 letras de posiciones aleatorias:");
                for (int i = 0; i < 6; i++) {
                    int posicionAleatoria = random.nextInt(frase.length());
                    System.out.print(frase.charAt(posicionAleatoria) + " ");
                }
            } else {
                System.out.println("La frase debe tener al menos 10 caracteres.");
            }
        }
    }

