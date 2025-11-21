import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ex_03 {
//    Exercicio 03: Crie um Function<String, Integer> que retorna o tamanho da string.

    public static void main(String[] args) {
        Function<String, Integer> howLongIs = s -> s.length();

        System.out.println(howLongIs.apply("Jabuticaba"));
    }
}
