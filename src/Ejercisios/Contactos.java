package Ejercisios;

import java.util.HashMap;

/**
 * EJERCICIO: Agenda de Contactos "Phone-Link"
 * OBJETIVO: Implementar una búsqueda rápida de información de contacto.
 */
public class Contactos {
    public static void main(String[] args) {
        HashMap<String, String> telefonos = new HashMap<>();

        telefonos.put("Marta", "3001234567");
        telefonos.put("Luis", "3019876543");
        telefonos.put("Sofía", "3025551111");

        System.out.println("Teléfono de Marta: " + telefonos.get("Marta"));

        for (String nombre : telefonos.keySet()) {
            System.out.println(nombre + " -> " + telefonos.get(nombre));
        }


        System.out.println("HashMap Datos");
    }
}
    