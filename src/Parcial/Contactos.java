package Parcial;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Contactos {

    static class Contacto {
        String nombre;
        String telefono;

        public Contacto(String nombre, String telefono) {
            this.nombre = nombre;
            this.telefono = telefono;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Contacto> agenda = new HashMap<>();

        System.out.println("=== Registro de Contactos ===");
        System.out.println("Escribe 'fin' para terminar.");

        while (true) {
            System.out.print("\nNombre del contacto: ");
            String nombre = scanner.nextLine();

            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.print("Teléfono: ");
            String tel = scanner.nextLine();

            agenda.put(nombre, new Contacto(nombre, tel));
        }

        System.out.println("\n--- Lista de Contactos Registrados ---");
        for (Map.Entry<String, Contacto> entry : agenda.entrySet()) {
            Contacto c = entry.getValue();
            System.out.println("Nombre: " + c.nombre + " | Teléfono: " + c.telefono);
        }

        System.out.print("\nIngrese un nombre para buscar: ");
        String nombreBuscar = scanner.nextLine();
        if (agenda.containsKey(nombreBuscar)) {
            Contacto encontrado = agenda.get(nombreBuscar);
            System.out.println("Encontrado -> Tel: " + encontrado.telefono);
        } else {
            System.out.println("El contacto no existe.");
        }

        System.out.print("\nIngrese el nombre del contacto a eliminar: ");
        String nombreEliminar = scanner.nextLine();
        if (agenda.remove(nombreEliminar) != null) {
            System.out.println("Contacto eliminado con éxito.");
        } else {
            System.out.println("No se pudo eliminar: el nombre no existe.");
        }

        System.out.println("\n--- Agenda Final ---");
        for (Map.Entry<String, Contacto> entry : agenda.entrySet()) {
            Contacto c = entry.getValue();
            System.out.println(c.nombre + " - " + c.telefono);
        }

        scanner.close();
    }
}