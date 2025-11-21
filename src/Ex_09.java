import java.util.function.Function;
import java.util.function.Predicate;

public class Ex_09 {
//    Exercicio 09: Use Predicate<String> para testar se o texto contém “Java”.

    public static void main(String[] args) {
        Predicate<String> testaTexto = s -> s.contains("Java");

        System.out.println(testaTexto.test("O Javali sabe Java"));
    }

}
