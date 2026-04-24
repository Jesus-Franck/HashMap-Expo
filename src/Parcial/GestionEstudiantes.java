package Parcial;

import java.util.*;

class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;

    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public double getPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Edad: " + edad + " | Promedio: " + promedio;
    }
}

public class GestionEstudiantes {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Estudiante> lista = new ArrayList<>();

            System.out.println("=== Registro de Estudiantes ===");
            System.out.println("Ingresa nombre , edad y promedio.");
            System.out.println("Escribe 'fin' para terminar.");

            while (true) {
                System.out.print("\nNombre: ");
                String nombre = scanner.nextLine();
                if (nombre.equalsIgnoreCase("fin"))
                    break;

                System.out.print("Edad: ");
                int edad = scanner.nextInt();
                System.out.print("Promedio: ");
                double promedio = scanner.nextDouble();
                scanner.nextLine();

                lista.add(new Estudiante(nombre, edad, promedio));
            }

            System.out.println("\n--- Lista completa de estudiantes ---");
            for (Estudiante e : lista) {
                System.out.println(e);
            }

            ArrayList<Estudiante> filtrados = new ArrayList<>();
            for (Estudiante e : lista) {
                if (e.getPromedio() >= 3.5) {
                    filtrados.add(e);
                }
            }

            filtrados.sort((e1, e2) -> Double.compare(e2.getPromedio(), e1.getPromedio()));

            System.out.println("\n--- Estudiantes con promedio >= 3.5 (Orden Descendente) ---");
            if (filtrados.isEmpty()) {
                System.out.println("Ninguno cumple el criterio.");
            } else {
                for (Estudiante e : filtrados) {
                    System.out.println(e);
                }
            }
        }

    }
}