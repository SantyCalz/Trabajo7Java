package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

                Scanner entrada = new Scanner(System.in);

                System.out.print("Ingresa una palabra: ");
                String palabra = entrada.nextLine();


                for (int i = 0; i < palabra.length(); i++) {

                    for (int j = 0; j < i; j++) {
                        System.out.print(" ");
                    }
                    System.out.println(palabra.charAt(i));
                }
            }
        }


