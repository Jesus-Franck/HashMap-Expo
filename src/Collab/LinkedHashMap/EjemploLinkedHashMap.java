package Collab.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class EjemploLinkedHashMap {
    public static void main(String[] args) {
        Map<String, String> registroEntrada = new LinkedHashMap<>();

        registroEntrada.put("Juan Pérez", "Desarrollador");
        registroEntrada.put("Ana Gómez", "Diseñadora");
        registroEntrada.put("Luis Torres", "Gerente");

        System.out.println("Lista de asistencia (Orden de llegada):");

        for (Map.Entry<String, String> entrada : registroEntrada.entrySet()) {
            System.out.println("Nombre: " + entrada.getKey() + " | Cargo: " + entrada.getValue());
        }
    }
}