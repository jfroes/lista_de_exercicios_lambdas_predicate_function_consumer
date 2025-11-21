import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ex_19 {
//    Exercicio 20: Simule um mini pipeline: filtrar, transformar e imprimir lista em uma linha.



    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Predicate<Integer> even = n -> n % 2 == 0;
        Predicate<Integer> odd = Predicate.not(even);

        Function<Integer, Integer> plusTwo = n -> n + 2;

        numeros.stream().filter(odd).map(plusTwo).toList().forEach(n -> System.out.print(n + ", "));



    }
}
