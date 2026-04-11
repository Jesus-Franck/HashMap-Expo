package Ejercisios;

import java.util.HashMap;

/**
 * EJERCICIO: Gestión de Inventario "Quick-Store"
 * OBJETIVO: Comprender la inserción y actualización de datos en un HashMap.
 */
public class Inventario {
    public static void main(String[] args) {
        HashMap<String, Integer> stock = new HashMap<>();

        stock.put("Manzanas", 50);
        stock.put("Naranjas", 30);
        stock.put("Bananas", 20);

        stock.put("Manzanas", 60);

        for (var entry : stock.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " unidades");
        }
    }
}