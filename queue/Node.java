package src.ds.queue;

public class Node<T> { // <T> é um tipo genérico
    T value; // variavel do tipo T que armazena o valor do nó
    Node<T> next; // variavel do tipo Node que aponta para o próximo nó

    public Node(T value) {
        this.value = value;
        this.next = null;
    }
}
