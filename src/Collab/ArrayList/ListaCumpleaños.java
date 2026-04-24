package Collab.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

class Persona {
    private String nombre;
    private String fechaCumple;

    public Persona(String nombre, String fechaCumple) {
        this.nombre = nombre;
        this.fechaCumple = fechaCumple;
    }

    @Override
    public String toString() {
        return nombre + " - " + fechaCumple;
    }
}

public class ListaCumpleaños {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Persona> lista = new ArrayList<>();

        System.out.println("=== Lista de Cumpleaños ===");
        System.out.println("Ingresa nombre y fecha de cumpleaños.");
        System.out.println("Escribe 'fin' para terminar.");

        while (true) {
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.print("Fecha (dd/mm): ");
            String fecha = scanner.nextLine();

            Persona persona = new Persona(nombre, fecha);
            lista.add(persona);
        }

        System.out.println("\n--- Lista final de cumpleaños ---");
        for (Persona p : lista) {
            System.out.println("- " + p);
        }

        scanner.close();
    }
}
