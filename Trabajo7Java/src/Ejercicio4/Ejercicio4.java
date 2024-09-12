package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();

        if (esNumeroArmstrong(numero)) {
            System.out.println(numero + " es un numero de Armstrong.");
        } else {
            System.out.println(numero + " no es un numero de Armstrong.");
        }
    }

    public static boolean esNumeroArmstrong(int numero) {
        int suma = 0;
        int original = numero;
        int digitos = contarDigitos(numero);

        while (numero > 0) {
            int digito = numero % 10;
            suma += Math.pow(digito, digitos);
            numero /= 10;
        }

        return suma == original;
    }

    public static int contarDigitos(int numero) {
        return String.valueOf(numero).length();
    }
}
