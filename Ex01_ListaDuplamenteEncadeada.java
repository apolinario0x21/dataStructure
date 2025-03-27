package src.ds;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Ex01_ListaDuplamenteEncadeada {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C");
        list.remove("C");

        // Alternativa 1 - Usando loop para exibir a lista
        for (String lang : list) {
            System.out.println(lang);
        }

        // Alternativa 2 - Usando collections para exibir a lista
        Collections.sort(list);
        list.forEach(System.out::println);

        System.out.println("\nLista Duplamente Encadeada: ");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Teclado");
        linkedList.add("Mouse");
        linkedList.addFirst("Monitor");
        linkedList.addLast("Cadeira");

        System.out.println("Primeiro elemento: " + linkedList.getFirst());
        linkedList.forEach(System.out::println);
    }
}
