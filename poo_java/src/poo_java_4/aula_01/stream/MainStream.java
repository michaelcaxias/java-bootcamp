package poo_java_4.aula_01.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8 , 9, 10);

        Stream<Integer> stream = numbers.stream();

        System.out.println("Exibindo todos os dados: ");
        stream.forEach(System.out::println);
        // forEach é um método final, então a stream acaba aqui.

        System.out.println("Números pares: ");
        // numbers.stream() abre uma nova stream.
        List<Integer> pairsList = numbers.stream().filter((n) -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(pairsList);

        System.out.println("Números ordenados: ");
        List<Integer> sortedList = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
