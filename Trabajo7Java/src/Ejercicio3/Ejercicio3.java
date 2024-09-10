package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa tu edad (en años): ");
        int edad = entrada.nextInt();

        int diasEnUnAño = 365;
        int edadEnDias = edad * diasEnUnAño;

        System.out.println("Tu edad representa aproximadamente " + edadEnDias + " días.");

    }
}

