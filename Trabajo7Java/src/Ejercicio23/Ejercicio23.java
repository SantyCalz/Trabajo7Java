package Ejercicio23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> coloresAutos = new ArrayList<>();
        String color;

        System.out.println("Ingresa los colores de los autos que ves pasar. Ingresa 't' para terminar.");

        while (true) {
            System.out.print("Color de auto: ");
            color = scanner.nextLine();

            if (color.equalsIgnoreCase("t")) {
                break;
            }

            coloresAutos.add(color);
        }

        if (coloresAutos.size() > 0) {
            String colorMasComun = colorMasVisto(coloresAutos);
            System.out.println("El color de auto más común durante el viaje fue: " + colorMasComun);
        } else {
            System.out.println("No se ingresaron colores.");
        }
    }

    // Método para encontrar el color más común
    public static String colorMasVisto(ArrayList<String> colores) {
        Map<String, Integer> frecuenciaColores = new HashMap<>();

        for (String color : colores) {
            frecuenciaColores.put(color, frecuenciaColores.getOrDefault(color, 0) + 1);
        }

        String colorMasComun = null;
        int maxFrecuencia = 0;

        for (Map.Entry<String, Integer> entry : frecuenciaColores.entrySet()) {
            if (entry.getValue() > maxFrecuencia) {
                maxFrecuencia = entry.getValue();
                colorMasComun = entry.getKey();
            }
        }

        return colorMasComun;
    }
}

