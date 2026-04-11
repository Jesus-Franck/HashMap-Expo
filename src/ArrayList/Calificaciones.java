package ArrayList;

/**
 * COMPARATIVA: Gestión de Notas
 * OBJETIVO: Mostrar que HashMap es más directo para relacionar dos datos.
 */
import java.util.ArrayList;

class Estudiante {
    String nombre;
    double nota;

    Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
}

public class Calificaciones {
    public static void main(String[] args) {
        ArrayList<Estudiante> notas = new ArrayList<>();

        notas.add(new Estudiante("Andrea", 4.5));
        notas.add(new Estudiante("camilo", 3.8));
        notas.add(new Estudiante("Lucía", 4.9));

        for (Estudiante e : notas) {
            if (e.nombre.equals("camilo")) {
                System.out.println("camilo tiene nota de: " + e.nota);
            }
        }

        for (Estudiante e : notas) {
            System.out.println(e.nombre + " obtuvo: " + e.nota);
        }
    }
}