package Collab.ComparableT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// 1. Uso de Comparable para el ORDEN NATURAL (por ID)
class EstudiantePro implements Comparable<EstudiantePro> {
    private int id;
    private String nombre;
    private double promedio;

    public EstudiantePro(int id, String nombre, double promedio) {
        this.id = id;
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public double getPromedio() {
        return promedio;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(EstudiantePro otro) {
        // Ordena de menor a mayor por ID
        return Integer.compare(this.id, otro.id);
    }

    @Override
    public String toString() {
        return String.format("ID: %03d | %-10s | Promedio: %.2f", id, nombre, promedio);
    }
}

public class SistemaGestionPotente {
    public static void main(String[] args) {
        ArrayList<EstudiantePro> db = new ArrayList<>();
        db.add(new EstudiantePro(105, "Zulma", 3.20));
        db.add(new EstudiantePro(101, "Andrés", 4.85));
        db.add(new EstudiantePro(103, "Bernardo", 4.10));

        System.out.println("=== SISTEMA DE GESTIÓN POTENTE ===");

        // A. Ordenar por el orden natural (Comparable -> ID)
        Collections.sort(db);
        System.out.println("\n1. Lista por ID (Orden Natural):");
        db.forEach(System.out::println);

        // B. Ordenar por Nombre usando un Comparator (Clase anónima)
        db.sort(new Comparator<EstudiantePro>() {
            @Override
            public int compare(EstudiantePro e1, EstudiantePro e2) {
                return e1.getNombre().compareTo(e2.getNombre());
            }
        });
        System.out.println("\n2. Lista por Nombre (Comparator Alfabético):");
        db.forEach(System.out::println);

        // C. Ordenar por Promedio DESCENDENTE (Lambda moderna)
        // Este es el nivel que pide el parcial para filtros avanzados
        db.sort((e1, e2) -> Double.compare(e2.getPromedio(), e1.getPromedio()));

        System.out.println("\n3. Ranking por Promedio (Comparator Descendente):");
        db.forEach(System.out::println);
    }
}