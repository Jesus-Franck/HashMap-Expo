package Collab.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class NumerosSinRepetir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();

        System.out.println("Ingresa 8 números:");

        int contador = 0;
        while (contador < 8) {
            System.out.print("Número " + (contador + 1) + ": ");
            int num = scanner.nextInt();
            numeros.add(num);
            contador++;
        }

        System.out.println("\nNúmeros sin repetir y en orden de ingreso:");
        for (Integer n : numeros) {
            System.out.println(n);
        }

        scanner.close();
    }
}