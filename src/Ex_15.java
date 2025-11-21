import java.util.function.Predicate;

public class Ex_15 {
//    Exercicio 15: Combine dois Predicate com .and() e .or().

    public static void main(String[] args) {
    Predicate<Integer> isOdd = n -> n % 3 == 0;
    Predicate<Integer> isLessThanTen = n -> n < 10;

        System.out.println(isOdd.and(isLessThanTen).test(9));

    }

}
