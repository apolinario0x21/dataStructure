package src.ds.stack;

public class Stack<T> {
    Node<T> top;
    int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public void push(T value) {
        if(value == null) {
            throw new IllegalArgumentException("Não pode inserir null na pilha");
        }

        Node<T> newNode = new Node<>(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public T pop(){
        if(size == 0) {
            throw new IllegalStateException("Pilha está vazia");
        }

        T value = top.value;
        top = top.next;
        size--;
        return value;
    }

    public T peek() {
        if(isEmpty()) throw new IllegalStateException("Pilha vazia");
        return top.value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<T> current = top;
        while(current != null) {
            sb.append(current.value);
            if(current.next != null) sb.append(", ");
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }


}
