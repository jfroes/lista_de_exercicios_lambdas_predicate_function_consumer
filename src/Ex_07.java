import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex_07 {
//    Exercicio 07: Use removeIf() para excluir nomes com menos de 4 letras.

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(Arrays.asList("José", "Paulo", "Ana", "Ronaldo", "Lua", "Fernando", "Bob", "Theo", "Zé", ""));

        nomes.removeIf(nome -> nome.length() < 4);

        nomes.forEach(System.out::println);

    }

}
