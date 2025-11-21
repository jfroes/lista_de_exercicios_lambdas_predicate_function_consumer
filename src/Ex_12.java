import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ex_12 {
//    Exercicio 12: Crie Function<Produto, String> que retorna “nome – R$preco”.

    public static void main(String[] args) {
        Function<Produto, String> namePrice =  p -> p.getNome().concat(" - R$").concat(p.getPreco().toString());

        List<Produto> produtos = new ArrayList<>(Arrays.asList(
                new Produto("fone com microfone", 10.0),
                new Produto("carregador", 15.0),
                new Produto("cabo usb tipo-c", 18.0),
                new Produto("Tomada 220v", 9.90),
                new Produto("placa de vídeo", 1570.0),
                new Produto("processador", 189.0)
        ));

        produtos.stream().map(namePrice).toList().forEach(System.out::println);


    }

}
