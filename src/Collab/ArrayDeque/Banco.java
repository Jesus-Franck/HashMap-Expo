package Collab.ArrayDeque;

import java.util.ArrayDeque;

public class Banco {

    static class Persona {
        String nombre;
        int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
    }

    public static void main(String[] args) {

        ArrayDeque<Persona> cola = new ArrayDeque<>();

        cola.add(new Persona("Ana", 20));
        cola.add(new Persona("Luis", 25));
        cola.add(new Persona("Sofia", 22));
        cola.add(new Persona("Carlos", 30));

        Persona primero = cola.peek();
        System.out.println("Primero en la cola: " + primero.nombre);

        cola.poll();
        cola.poll();
        

        System.out.println("\nCola final:");
        for (Persona p : cola) {
            System.out.println(p.nombre + " tiene " + p.edad + " años");
        }
    }
}