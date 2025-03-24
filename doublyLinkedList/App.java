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
    }
}