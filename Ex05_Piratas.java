package src.ds;

import java.util.Scanner;
import java.util.LinkedList;

public class Ex05_Piratas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String opcao;
        LinkedList<String> tripulantes = new LinkedList<>();

        tripulantes.add("Luffy");
        tripulantes.add("Zoro");

        System.out.println("\n\nA tripulação dos Chapéus de Palha... Nami, Usopp, etc... basta adicionar");

        do {
            System.out.println("\nTripulação atual: " + tripulantes);

            if (!tripulantes.isEmpty()) {
                System.out.println("Primeiro integrante da fila é: " + tripulantes.peek());
            } else {
                System.out.println("A fila está vazia");
                break;
            }

            System.out.println("\nEscolha uma opção: ");
            System.out.println("1 - Adicionar um novo integrante à fila");
            System.out.println("2 - Remover o próximo integrante da fila");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");

            opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.print("Digite o nome para adicionar à fila: ");
                    String newName = scanner.nextLine();
                    tripulantes.add(newName);
                    System.out.println(newName + "Foi adicionado à fila");
                    break;
                case "2":
                    if (!tripulantes.isEmpty()) {
                        String removido = tripulantes.poll();
                        System.out.println(removido + " foi removido da fila");
                    } else {
                        System.out.println("A fila já está vazia");
                    }
                    break;
                case "3":
                    System.out.println("Encerrando a simulação");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (!opcao.equals("3"));
    }
}
