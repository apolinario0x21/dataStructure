package src.ds;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex04_Frase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> palavras = new ArrayList<>();

        System.out.print("Escreva algo: ");
        String frase = scanner.nextLine();

        for (String palavra : frase.split(" ")) {
            palavras.add(palavra);
        }

        palavras.removeIf(palavra -> palavra.length() < 4);

        System.out.println("Palavra com 4 ou mais caracteres: " + palavras);
    }
}
