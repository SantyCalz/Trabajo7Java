package Ejercicio5;

import java.util.Random;
public class Ejercicio5 {
    public static void main(String[] args) {
        Random rand = new Random();

        int fuerza = generarHabilidad(rand);
        int destreza = generarHabilidad(rand);
        int constitucion = generarHabilidad(rand);
        int inteligencia = generarHabilidad(rand);
        int sabiduria = generarHabilidad(rand);
        int carisma = generarHabilidad(rand);

        System.out.println("Habilidades del personaje:");
        System.out.println("Fuerza: " + fuerza);
        System.out.println("Destreza: " + destreza);
        System.out.println("Constitución: " + constitucion);
        System.out.println("Inteligencia: " + inteligencia);
        System.out.println("Sabiduría: " + sabiduria);
        System.out.println("Carisma: " + carisma);

        int salud = calcularSalud(constitucion);
        System.out.println("Salud del personaje: " + salud);
    }

    public static int generarHabilidad(Random rand) {
        int[] dados = new int[4];

        for (int i = 0; i < 4; i++) {
            dados[i] = rand.nextInt(6) + 1; // Dado de 6 caras
        }

        int menorDado = dados[0];
        int suma = 0;
        for (int i = 0; i < 4; i++) {
            suma += dados[i];
            if (dados[i] < menorDado) {
                menorDado = dados[i];
            }
        }

        suma -= menorDado;

        return suma;
    }

    public static int calcularSalud(int constitucion) {
        int modificador = (constitucion - 10) / 2; // Dividiendo y redondeando hacia abajo
        return 10 + modificador;
    }
}
