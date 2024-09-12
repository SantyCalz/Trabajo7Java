package Ejercicio11al14;

public class ParsearTexto {

    public static String chauEspacios(String texto) {
        return texto.trim().replace(" ", "_");
    }

    public static String soloLetras(String texto) {
        return texto.replaceAll("[^a-zA-Z]", "");
    }

    public static String acronimo(String frase) {
        frase = frase.replaceAll("[^a-zA-Z ]", "").trim();
        String[] palabras = frase.split("\\s+");
        StringBuilder acronimo = new StringBuilder();

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                acronimo.append(Character.toUpperCase(palabra.charAt(0)));
            }
        }

        return acronimo.toString();
    }

    public static String kebabToCamel(String texto) {
        String[] palabras = texto.split("-");
        StringBuilder camelCase = new StringBuilder(palabras[0]);

        for (int i = 1; i < palabras.length; i++) {
            camelCase.append(Character.toUpperCase(palabras[i].charAt(0)))
                    .append(palabras[i].substring(1).toLowerCase());
        }

        return camelCase.toString();
    }
}
