import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex_11 {
//    Exercicio 11: Crie Predicate<Produto> para filtrar produtos com preço > 100.

    public static void main(String[] args) {
        Predicate<Produto> isLessThanOneHundred = p -> p.getPreco() < 100;

        List<Produto> produtos = new ArrayList<>(Arrays.asList(
                new Produto("fone com microfone", 10.0),
                new Produto("carregador", 15.0),
                new Produto("cabo usb tipo-c", 18.0),
                new Produto("Tomada 220v", 9.90),
                new Produto("placa de vídeo", 1570.0),
                new Produto("processador", 189.0)
        ));

        produtos.stream().filter(isLessThanOneHundred)
                .toList().forEach(System.out::println);


    }

}
