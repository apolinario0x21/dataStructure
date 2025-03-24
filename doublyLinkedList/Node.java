package src.ds.doublyLinkedList;

public class Node<T> { // <T> é um tipo genérico
    T value; // variavel do tipo T que armazena o valor do nó
    Node<T> next; // variavel do tipo Node que aponta para o próximo nó
    Node<T> previous; //

    public Node(T value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }

}