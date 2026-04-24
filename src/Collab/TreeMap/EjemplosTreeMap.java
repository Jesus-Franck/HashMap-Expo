package Collab.TreeMap;

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class EjemplosTreeMap {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // TreeMap ordena de menor a mayor automáticamente por la clave (Integer)
            TreeMap<Integer, String> inventario = new TreeMap<>();

            System.out.println("=== Registro de Inventario (TreeMap) ===");
            System.out.println("Ingrese ID (número) y Producto. Use ID '0' para finalizar.");

            while (true) {
                System.out.print("ID del producto: ");
                int id = sc.nextInt();
                if (id == 0)
                    break;
                sc.nextLine(); // Limpiar buffer

                System.out.print("Nombre del producto: ");
                String producto = sc.nextLine();

                inventario.put(id, producto);
            }

            // Mostrar contenido ordenado
            System.out.println("\n--- Inventario Ordenado por ID ---");
            for (Map.Entry<Integer, String> entry : inventario.entrySet()) {
                System.out.println("ID: " + entry.getKey() + " | Producto: " + entry.getValue());
            }

            // Funciones de navegación exclusivas de TreeMap
            if (!inventario.isEmpty()) {
                System.out.println("\n--- Funciones de Navegación ---");
                System.out.println("Primer producto (ID más bajo): " + inventario.firstKey());
                System.out.println("Último producto (ID más alto): " + inventario.lastKey());

                // Buscar el ID más cercano hacia abajo de 400
                System.out.println("ID más cercano a 400 (floorKey): " + inventario.floorKey(400));
            }

            // Eliminar un elemento
            System.out.print("\nIngrese ID para eliminar: ");
            int idEliminar = sc.nextInt();
            if (inventario.remove(idEliminar) != null) {
                System.out.println("Producto eliminado. Inventario final: " + inventario);
            } else {
                System.out.println("El ID no existe.");
            }
        }
    }
}