package src.ds;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Ex06_Stream {
    public static void main(String[] args) {
        List<Integer> lista = List.of(1,2,3,4,5);
        List<Integer> numerosPares = new ArrayList<>();

        for (Integer num : lista) {
            if (num % 2 == 0){
                numerosPares.add(num);
            }
        }

        System.out.println("Números pares: " + numerosPares);

        // com stream
        List<Integer> listWithStream = List.of(1,2,3,4,5);
        List<Integer> numerosParesWithStream = listWithStream.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
        System.out.println("Números pares: " + numerosParesWithStream);

        List<String> times = List.of("brasil, japão");
        List<String> selecao = times.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Seleções: " + selecao);

        List<Integer> numbers = List.of(1,2,3,4,5);
        List<Integer> showFirstNumbers = numbers.stream().sorted().limit(3).toList();
        System.out.println("Exibe os três primeiros números: " + showFirstNumbers);

        int soma = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Soma dos valores: " + soma);

    }
}
