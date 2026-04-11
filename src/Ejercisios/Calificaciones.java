package Ejercisios;

import java.util.HashMap;

/**
 * EJERCICIO: Registro de Calificaciones "Grade-Check"
 * OBJETIVO: Aprender a validar la existencia de datos antes de consultarlos.
 */
public class Calificaciones {
    public static void main(String[] args) {
        HashMap<String, Double> notas = new HashMap<>();

        notas.put("Andrea", 4.5);
        notas.put("camilo", 3.8);
        notas.put("Lucía", 4.9);

        if (notas.containsKey("camilo")) {
            System.out.println("camilo tiene nota de: " + notas.get("camilo"));
        }

        for (var entry : notas.entrySet()) {
            System.out.println(entry.getKey() + " obtuvo: " + entry.getValue());
        }
    }
}