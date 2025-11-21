import java.util.function.Predicate;

public class Ex_01 {
//    Exercicio 01: Crie um Predicate<Integer> que testa se o número é par.

    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(4));
    }
}
