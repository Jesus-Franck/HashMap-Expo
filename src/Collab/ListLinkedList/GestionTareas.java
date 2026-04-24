package Collab.ListLinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class GestionTareas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // LinkedList permite manipular los extremos eficientemente
        LinkedList<String> tareas = new LinkedList<>();

        System.out.println("=== Gestor de Tareas Pendientes ===");
        System.out.println("Escribe 'fin' para terminar.");

        while (true) {
            System.out.print("\nNueva tarea: ");
            String tarea = sc.nextLine();

            if (tarea.equalsIgnoreCase("fin"))
                break;

            System.out.print("¿Es urgente? (s/n): ");
            String urgente = sc.nextLine();

            if (urgente.equalsIgnoreCase("s")) {
                // Añade al inicio de la lista
                tareas.addFirst(tarea);
                System.out.println("Agregada como prioridad alta.");
            } else {
                // Añade al final de la lista
                tareas.addLast(tarea);
                System.out.println("Agregada a la lista general.");
            }
        }

        // Mostrar todas las tareas
        System.out.println("\n--- Lista de Tareas Actual ---");
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println((i + 1) + ". " + tareas.get(i));
        }

        // Operaciones adicionales de LinkedList
        if (!tareas.isEmpty()) {
            System.out.println("\nTarea más urgente: " + tareas.getFirst());
            System.out.println("Última tarea añadida: " + tareas.getLast());

            // Eliminar la primera tarea (simulando que se completó)
            System.out.print("\n¿Completar la primera tarea? (s/n): ");
            if (sc.nextLine().equalsIgnoreCase("s")) {
                String completada = tareas.removeFirst();
                System.out.println("Completada: " + completada);
            }
        }

        System.out.println("\nEstado final de la lista: " + tareas);
        sc.close();
    }
}