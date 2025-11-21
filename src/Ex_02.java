import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ex_02 {
//    Exercicio 02: Use o predicate para filtrar uma lista de inteiros.

    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        numeros.stream().filter(isEven::test).collect(Collectors.toList()).forEach(System.out::println);
    }
}
