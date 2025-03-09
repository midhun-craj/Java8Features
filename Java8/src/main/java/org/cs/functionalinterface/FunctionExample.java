package org.cs.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionExample {
    public static void main(String[] args) {

        // Function<T, R>
        // apply()
        Function<Integer, Double> square = num -> Double.valueOf(num * num);
        System.out.println(square.apply(4));

        // UnaryOperator<T>
        UnaryOperator<Integer> multiples = num -> num + num;
        System.out.println(multiples.apply(2));

        // BiFunction<T, U, R>
        BiFunction<Integer, Integer, Double> multiply = (n1, n2) -> Double.valueOf(n1 * n2);
        System.out.println(multiply.apply(2, 4));

        // BinaryOperator
        BinaryOperator<Double> perimeter = (n1, n2) -> n1 * n2;
        System.out.println(perimeter.apply(2.0, 3.0));

        // compose(Function before)
        Function<String, Integer> length = String::length;
        Function<Integer, Integer> product = n -> n * n;
        Function<String, Integer> composeResult = product.compose(length);
        System.out.println(composeResult.apply("midhun"));

        // andThen(Function after)
        Function<Integer, Integer> cube = n -> n * n * n;
        Function<Integer, Boolean> condition = n -> n % 2 == 0;
        Function<Integer, Boolean> andThenResult = cube.andThen(condition);
        System.out.println(andThenResult.apply(2));

        // identity()
        Function<String, String> id = Function.identity();
        System.out.println(id.apply("Hi"));
    }
}
