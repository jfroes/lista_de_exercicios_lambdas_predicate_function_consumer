import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Ex_17 {
//    Exercicio 17: Crie Consumer<Integer> que soma valores em uma variável externa (efeito colateral controlado).



    public static void main(String[] args) {
        int[] soma = {0};

        Consumer<Integer> somaValores = n -> soma[0]  += n;
    }
}
