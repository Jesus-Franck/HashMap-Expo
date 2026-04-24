package Collab.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class EjemplosArrayDeque {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // EJEMPLO 1 & 2: SIMULACIÓN DE FILA (ATENCIÓN AL CLIENTE)
            Queue<String> fila = new ArrayDeque<>();
            System.out.println("=== Simulación de Fila ===");
            System.out.println("Ingrese nombres de clientes (escribe 'fin' para terminar):");

            while (true) {
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();
                if (nombre.equalsIgnoreCase("fin"))
                    break;
                fila.offer(nombre); // Agrega al final de la cola
            }

            System.out.println("\nProcesando fila...");
            while (!fila.isEmpty()) {
                System.out.println("Siguiente en cola (peek): " + fila.peek());
                System.out.println("Atendiendo a: " + fila.poll()); // Saca y muestra
            }

            // EJEMPLO 3 & 4: MANIPULACIÓN DE EXTREMOS (ANIMALES)
            ArrayDeque<String> animales = new ArrayDeque<>();
            System.out.println("\n=== Manipulación de Extremos (ArrayDeque) ===");

            System.out.print("Animal para el centro: ");
            animales.add(sc.nextLine());

            System.out.print("Animal para el INICIO (addFirst): ");
            animales.addFirst(sc.nextLine());

            System.out.print("Animal para el FINAL (addLast): ");
            animales.addLast(sc.nextLine());

            System.out.println("\nEstado actual: " + animales);
            System.out.println("Primer elemento (getFirst): " + animales.getFirst());
            System.out.println("Último elemento (getLast): " + animales.getLast());
        }
    }
}