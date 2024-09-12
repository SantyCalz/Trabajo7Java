package Ejercicio11al14;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra en Kebab-Case: ");
        String kebabCase = scanner.nextLine();

        String camelCase = ParsearTexto.kebabToCamel(kebabCase);

        System.out.println("La palabra en CamelCase: " + camelCase);
    }
}
