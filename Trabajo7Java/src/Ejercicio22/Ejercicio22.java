package Ejercicio22;

import java.util.ArrayList;

public class Ejercicio22 {
        public static void main(String[] args) {

            ArrayList<String> lista = new ArrayList<>();


            lista.add("Hola");
            lista.add("Mundo");
            lista.add("Java");


            System.out.println("Elementos de la lista: " + lista);


            String elemento = lista.get(1);
            System.out.println("Elemento en el índice 1: " + elemento);


            lista.remove("Mundo");
            System.out.println("Lista después de eliminar 'Mundo': " + lista);

        }
    }


