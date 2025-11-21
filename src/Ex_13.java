import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Ex_13 {
//    Exercicio 13: Use map() com Function para transformar lista de nomes em maiúsculas.

    public static void main(String[] args) {
        Function<String, String> textToUpper = s -> s.toUpperCase();

        List<String> nomes = Arrays.asList("José", "Paulo", "Pedro", "Ronaldo", "Luiz", "Fernando", "Bob");

        nomes.stream().map(textToUpper).toList().forEach(System.out::println);

    }

}
