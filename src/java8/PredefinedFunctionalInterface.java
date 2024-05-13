package java8;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefinedFunctionalInterface {
    public static void main(String[] args) {
        Function<String, String> f1 = (str) -> str + "Fine";    
        System.out.println(f1.apply("Hello"));


        BiFunction<String, Integer, String> biF = (a, b) -> a + b;
        System.out.println(biF.apply("Welcome", 10));

        Predicate<String> p = (a) -> {
            if (a.length() == 4)
                return true;
            else
                return false;
        };
        boolean result = p.test("Niaz");
        System.out.println(result);

        Consumer<String> consumer = (str) -> System.out.println("It's consumer");
        consumer.accept("Hello");
        Supplier<Integer> su = () -> 10;
        Integer result1 = su.get();
        System.out.println(result1);

    }
}

