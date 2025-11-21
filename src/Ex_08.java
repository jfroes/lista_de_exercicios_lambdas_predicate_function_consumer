import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Ex_08 {
//    Exercicio 08: Crie Function<Double, Double> que converte Celsius para Fahrenheit.

    public static void main(String[] args) {
        Function<Double, Double> celsius2Fahrenheit = c -> (c * 1.8) + 32;

        System.out.printf("F %.2f°", celsius2Fahrenheit.apply(37.0));

    }

}
