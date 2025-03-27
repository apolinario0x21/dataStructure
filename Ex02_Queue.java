package src.ds;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class Ex02_Queue {
    public static void main(String[] args) {
        System.out.println("FIFO - First In First Out\n");
        System.out.print("PriorityQueue - O elemento com menor valor é removido primeiro.\n");
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        /* Alternativa 2 - A ordem dos itens será alterada para ordem decrescente
         PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
         */

        priorityQueue.add(30);
        priorityQueue.add(10);
        priorityQueue.add(1);

        System.out.println("PriorityQueue: " + priorityQueue);
        System.out.println("PriorityQueue: (Cabeça da fila): " + priorityQueue.peek() + "\n");

        while (!priorityQueue.isEmpty()) {
            System.out.println("Removendo elemento: " + priorityQueue.poll());
        }

        /*
        Implementando Queue usando LinkedList
         */
        System.out.println("\nQueue com LinkedList.\n");
        Queue<String> linkedListQueue = new LinkedList<>();

        linkedListQueue.add("Elemento 1");
        linkedListQueue.add("Elemento 2");
        linkedListQueue.add("Elemento 3");
        System.out.println("LinkedList Queue: " + linkedListQueue);
        System.out.println("LinkedList Queue (cabeça da fila: " + linkedListQueue.peek());
    }
}
