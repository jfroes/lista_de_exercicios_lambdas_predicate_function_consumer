import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Ex_06 {
//    Exercicio 06: Crie uma lista de nomes e use forEach com lambda.

    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("José", "Paulo", "Pedro", "Ronaldo", "Luiz", "Fernando", "Bob");

        nomes.forEach(nome -> System.out.println(nome));

    }

}
