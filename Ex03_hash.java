package src.ds;
import java.util.HashMap;

public class Ex03_hash {
    public static void main(String[] args) {
        System.out.println("HashMap\n");

        HashMap<String, Integer> hashMap = new java.util.HashMap<>();

        hashMap.put("camiseta", 50);
        hashMap.put("tênis", 200);
        hashMap.put("calça jeans", 110);

        System.out.println("Valor do tênis: " + hashMap.get("tênis"));

        // lambda = função anomima
        hashMap.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
