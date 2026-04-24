package Ejercisios;

import java.util.HashMap;
import java.util.Map;

public class Personas {

    static class Persona {
        String nombre;
        int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
    }

    public static void main(String[] args) {

        HashMap<String, Persona> personas = new HashMap<>();

        personas.put("1", new Persona("Ana", 20));
        personas.put("2", new Persona("Luis", 25));
        personas.put("3", new Persona("Sofia", 22));

        personas.put("1", new Persona("Jose", 31));

        for (Map.Entry<String, Persona> entry : personas.entrySet()) {
            Persona p = entry.getValue();
            System.out.println(p.nombre + " tiene " + p.edad + " años");
        }
    }
}