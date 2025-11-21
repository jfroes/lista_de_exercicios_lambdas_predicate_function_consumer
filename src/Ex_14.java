import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ex_14 {
//    Exercicio 14: Crie Predicate<String> que verifica se começa com vogal.

    public static void main(String[] args) {
    Predicate<String> comecaComVogal = s -> "aeiouAEIOU".contains(s.substring(0,1));

    System.out.println(comecaComVogal.test("José"));
    System.out.println(comecaComVogal.test("Ernesto"));
    System.out.println(comecaComVogal.test("Abacaxi"));


    }

}
