import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ex_16 {
//    Exercicio 16: Encadeie duas funções com .andThen().

    public static void main(String[] args) {
        Function<Integer, Integer> dobra = n -> n * 2;
        Function<Integer, Integer> somaUm = n -> n +1;

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        numeros.stream().map(dobra.andThen(somaUm)).toList().forEach(System.out::println);
    }
}
