package Parcial;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ContadorPalabras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> conteo = new HashMap<>();

        System.out.println("=== Contador de Palabras ===");
        System.out.println("Escribe 'fin' para terminar.");

        while (true) {
            System.out.print("Palabra: ");
            String palabra = sc.nextLine().trim().toLowerCase();

            if (palabra.equalsIgnoreCase("fin")) {
                break;
            }

            if (!palabra.isEmpty()) {
                conteo.put(palabra, conteo.getOrDefault(palabra, 0) + 1);
            }
        }

        // Para cumplir con "imprimir el resultado ordenado por palabra"
        // Extraemos las llaves del HashMap a una lista para ordenarlas
        ArrayList<String> llavesOrdenadas = new ArrayList<>(conteo.keySet());
        Collections.sort(llavesOrdenadas);

        System.out.println("\nResultado final (Ordenado alfabéticamente):");
        for (String palabra : llavesOrdenadas) {
            System.out.println(palabra + ": " + conteo.get(palabra));
        }

        sc.close();
    }
}