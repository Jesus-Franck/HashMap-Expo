import java.util.PriorityQueue;
import java.util.Queue;

public class EjemploPriority {
    public static void main(String[] args) {
        Queue<Integer> turnos = new PriorityQueue<>();

        // Agregamos turnos en desorden
        turnos.add(50);
        turnos.add(10);
        turnos.add(30);

        System.out.println("Atendiendo pacientes por nivel de urgencia:");

        while (!turnos.isEmpty()) {
            // poll() extrae siempre el elemento con mayor prioridad (el menor valor)
            System.out.println("Atendiendo al paciente con código: " + turnos.poll());
        }
    }
}