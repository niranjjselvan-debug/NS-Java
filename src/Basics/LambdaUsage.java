package Basics;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaUsage {
    static void main(String[] args) {
        Predicate<Integer> input = n -> n > 10;
        System.out.println(input.test(15));

        Consumer<String> printer = s -> System.out.println("Hello " + s);
        printer.accept("Niranjj");

        Supplier<Double> randomNumberSupplier = () -> Math.random();
        System.out.println(randomNumberSupplier.get());

        Function<Integer, Integer> output = n -> n * n;
        System.out.println(output.apply(5));


    }
}
