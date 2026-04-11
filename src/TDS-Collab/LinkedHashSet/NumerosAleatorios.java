
import java.util.LinkedHashSet;
import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();
        Random random = new Random();

        System.out.println("Generando 8 números aleatorios...");

        int contador = 0;
        while (contador < 8) {
            int num = random.nextInt(10); // números entre 0 y 9
            System.out.println("Generado: " + num);
            numeros.add(num);
            contador++;
        }

        System.out.println("\nNúmeros sin repetir y en orden generado:");
        for (Integer n : numeros) {
            System.out.println(n);
        }
    }
}