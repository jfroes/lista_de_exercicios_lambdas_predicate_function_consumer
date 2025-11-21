import java.util.function.Consumer;
import java.util.function.Function;

public class Ex_04 {
//    Exercicio 04: Crie um Consumer<String> que imprime em maiúsculas

    public static void main(String[] args) {
        Consumer<String> emMaiusculas = s -> System.out.println(s.toUpperCase());

        emMaiusculas.accept("Chama o Var");
    }
}
