package Collab.HashSet;

import java.util.Stack;
import java.util.Scanner;

public class HistorialNavegador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> historial = new Stack<>();

        System.out.println("=== Simulador de Historial de Navegación ===");
        System.out.println("1. Visitar nueva página");
        System.out.println("2. Botón Atrás (Retroceder)");
        System.out.println("3. Ver página actual");
        System.out.println("4. Salir");

        int opcion;
        do {
            System.out.print("\nSelecciona una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa la URL: ");
                    String url = sc.nextLine();
                    historial.push(url); // push añade a la cima de la pila
                    System.out.println("Navegando a: " + url);
                    break;
                case 2:
                    if (!historial.isEmpty()) {
                        String eliminada = historial.pop(); // pop saca el elemento de la cima
                        System.out.println("Cerrando: " + eliminada);
                        if (!historial.isEmpty()) {
                            System.out.println("Ahora estás en: " + historial.peek());
                        }
                    } else {
                        System.out.println("No hay historial para retroceder.");
                    }
                    break;
                case 3:
                    if (!historial.isEmpty()) {
                        System.out.println("Página actual (cima): " + historial.peek());
                    } else {
                        System.out.println("El historial está vacío.");
                    }
                    break;
            }
        } while (opcion != 4);

        sc.close();
    }
}