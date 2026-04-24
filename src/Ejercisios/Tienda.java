package Ejercisios;

import java.util.HashMap;

public class Tienda {
    public static void main(String[] args) {
        HashMap<String, Integer> inventario = new HashMap<>();

        // 1. Agrega los productos con una cantidad inicial (ej: 10 unidades cada uno)
        inventario.put("Memoria RAM", 10);
        inventario.put("Disco Duro", 10);
        inventario.put("Tarjeta Gráfica", 10);

        // 2. Simula una venta de 'Memoria RAM' (Réstale 1 al valor actual)
        inventario.put("Memoria RAM", inventario.get("Memoria RAM") - 1);

        // 3. Verifica si existe el producto 'Monitor'.
        // Si no está, imprime: "Producto no disponible".
        if (!inventario.containsKey("Monitor")) {
            System.out.println("Producto no disponible");
        }

        System.out.println("Estado del inventario: " + inventario);
    }
}