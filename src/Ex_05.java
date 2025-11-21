import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Ex_05 {
//    Exercicio 05: Combine Predicate e Consumer para imprimir apenas números pares.

    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Consumer<Integer>  printNumeros = n -> System.out.println(n);

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        numeros.stream().filter(n -> isEven.test(n)).forEach(printNumeros::accept);


    }

}
