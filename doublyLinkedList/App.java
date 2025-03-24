package src.ds.doublyLinkedList;

public class App {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        System.out.print("Adicionando elemento no final: ");
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.display();

        System.out.print("Adicionando elementos no início: ");
        list.addFirst(-3);
        list.addFirst(-2);
        list.addFirst(-1);
        list.display();

        System.out.print("Removendo elementos do final e do começo: ");
        list.removeLast();
        list.removeFirst();
        list.display();

        // Lista vazia?
        System.out.print("Tentando remover de lista vazia - ");
        try {
            DoublyLinkedList<Integer> emptyList = new DoublyLinkedList<>();
            emptyList.removeFirst();
        } catch (IllegalStateException e) {
            System.out.println("Erro capturado: " + e.getMessage());
        }

        System.out.println("Tamanho da lista: " + list.size());

        // Adicionando diferentes tipos, usando outra lista
        DoublyLinkedList<String> stringList = new DoublyLinkedList<>();
        stringList.addLast("Estrutura");
        stringList.addLast("de");
        stringList.addLast("Dados");
        stringList.display();

        System.out.println("Removendo todos os elementos:");
        while (list.size() > 0) { // ou while (!stringList.isEmpty()) {
            list.removeLast();
            list.display();
        }

        System.out.println(list.isEmpty());
        System.out.println(stringList.isEmpty());
    }
}