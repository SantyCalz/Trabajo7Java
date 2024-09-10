package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa tu peso en la Tierra (kg): ");
        double pesoEnTierra = entrada.nextDouble();

        double pesoEnMarte = calcularPesoEnMarte(pesoEnTierra);
        System.out.println("Tu peso en Marte sería: " + pesoEnMarte + " kg");

    }
    public static double calcularPesoEnMarte(double pesoEnTierra) {
        return pesoEnTierra * 0.38; // Retorna el peso en Marte
    }
}
