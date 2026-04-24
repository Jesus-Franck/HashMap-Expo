package ArrayList;

/**
 * COMPARATIVA: Búsqueda en ArrayList (Manual)
 * OBJETIVO: Ver la diferencia de eficiencia frente al HashMap.
 */
import java.util.ArrayList;

class Contacto {
    String nombre;
    String telefono;

    Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
}

public class Contactos {
    public static void main(String[] args) {
        ArrayList<Contacto> telefonos = new ArrayList<>();

        telefonos.add(new Contacto("Marta", "3001234567"));
        telefonos.add(new Contacto("Luis", "3019876543"));
        telefonos.add(new Contacto("Sofía", "3025551111"));

        for (Contacto c : telefonos) {
            if (c.nombre.equals("Marta")) {
                System.out.println("Teléfono de Marta: " + c.telefono);
            }
        }

        for (Contacto c : telefonos) {
            System.out.println(c.nombre + " -> " + c.telefono);
        }

        System.out.println("Datos ArrayList ");
    }
}