package Ejercisios;

import java.util.HashMap;

/**
 * EJERCICIO: Diccionario Técnico "Traductor"
 * OBJETIVO: Aprender a recuperar datos específicos y recorrer las llaves (keys)
 * de un Mapa.
 */
public class Diccionario {
    public static void main(String[] args) {
        HashMap<String, String> traducciones = new HashMap<>();

        traducciones.put("Hola", "Hello");
        traducciones.put("Casa", "House");
        traducciones.put("Perro", "Dog");

        System.out.println("La traducción de 'Casa' es: " + traducciones.get("Casa"));

        for (String palabra : traducciones.keySet()) {
            System.out.println(palabra + " -> " + traducciones.get(palabra));
        }
    }
}