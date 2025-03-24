package src.ds.queue;

public class App {
    public static void main(String[] args) {
        Queue<Integer> list = new Queue<>();

        System.out.println("Fila vazia? " + list.isEmpty());

        list.enqueue(1);
        list.enqueue(2);
        list.enqueue(3);

        System.out.println("Fila vazia? " + list.isEmpty());
        System.out.println("Tamanho: " + list.size());
        System.out.println("Primeiro elemento: " + list.peek());

        System.out.println("Removendo: " + list.dequeue());
        System.out.println("Novo primeiro: " + list.peek()); // 20

        list.display();
    }
}