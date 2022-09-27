package poo_java_4.aula_01.lambda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Example02 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        numbers.forEach((n) -> {
            Integer lastElement = numbers.get(numbers.size() - 1);

            if (!Objects.equals(n, lastElement)) {
                System.out.print(n + "-");
            } else {
                System.out.println(n);
            }

        });
    }
}
