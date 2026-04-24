package Collab.HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class RegistroInvitados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // HashSet no permite elementos repetidos
        HashSet<String> invitados = new HashSet<>();

        System.out.println("=== Registro de Invitados Únicos ===");
        System.out.println("Escribe 'fin' para terminar.");

        while (true) {
            System.out.print("Nombre del invitado: ");
            String nombre = sc.nextLine().trim();

            if (nombre.equalsIgnoreCase("fin"))
                break;

            // add() devuelve false si el elemento ya existe en el conjunto
            if (invitados.add(nombre)) {
                System.out.println("Invitado '" + nombre + "' registrado.");
            } else {
                System.out.println("Aviso: '" + nombre + "' ya está en la lista.");
            }
        }

        System.out.println("\n--- Lista Final de Invitados (Sin duplicados) ---");
        for (String i : invitados) {
            System.out.println("- " + i);
        }
        sc.close();
    }
}