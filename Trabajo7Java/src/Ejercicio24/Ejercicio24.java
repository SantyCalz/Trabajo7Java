package Ejercicio24;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> miArray = new ArrayList<>();
        miArray.add("a");
        miArray.add("b");
        miArray.add("c");

        System.out.print("Ingresa el número de repeticiones del array dinámico: ");
        int repeticiones = scanner.nextInt();

        ArrayList<String> nuevoArray = repetir(miArray, repeticiones);
        System.out.println("Array dinámico repetido: " + nuevoArray);
    }

    public static ArrayList<String> repetir(ArrayList<String> original, int repeticiones) {
        ArrayList<String> resultado = new ArrayList<>();

        for (int i = 0; i < repeticiones; i++) {
            resultado.addAll(original);
        }

        return resultado;
    }
}
