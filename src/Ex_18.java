import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Ex_18 {
//    Exercicio 18: Use Predicate.not() para inverter a condição.



    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Predicate<Integer> even = n -> n % 2 == 0;
        Predicate<Integer> odd = Predicate.not(even);



    }
}
