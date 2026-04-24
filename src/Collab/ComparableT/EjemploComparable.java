package Collab.ComparableT;

import java.util.ArrayList;
import java.util.Collections;

// Implementamos Comparable para que Estudiante sepa cómo compararse a sí mismo
class Estudiante implements Comparable<Estudiante> {
    String nombre;
    double promedio;

    public Estudiante(String nombre, double promedio) {
        this.nombre = nombre;
        this.promedio = promedio;
    }

    @Override
    public int compareTo(Estudiante otro) {
        // Orden alfabético por nombre (orden natural)
        return this.nombre.compareTo(otro.nombre);
    }

    @Override
    public String toString() {
        return nombre + " (" + promedio + ")";
    }
}

public class EjemploComparable {
    public static void main(String[] args) {
        ArrayList<Estudiante> lista = new ArrayList<>();
        lista.add(new Estudiante("Zulma", 4.0));
        lista.add(new Estudiante("Abel", 3.5));

        // Collections.sort usa el compareTo que definimos
        Collections.sort(lista);

        System.out.println("Orden Natural (Nombre): " + lista);
    }
}
