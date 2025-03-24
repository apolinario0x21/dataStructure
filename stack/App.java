package src.ds.stack;

public class App {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println("Pilha vazia? " + (stack.size == 0)); // true

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Tamanho: " + stack.size); // 3

        System.out.println("Removendo: " + stack.pop()); // 30
        System.out.println("Removendo: " + stack.pop()); // 20

        System.out.println("Primeiro elemento: " + stack.peek());
        System.out.println("Tamanho atual: " + stack.size); // 1

        System.out.println(stack);
    }
}