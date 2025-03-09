package org.cs.functionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        // Predicate(T t)
        Predicate<Integer> isEven = number -> number % 2 == 0;

        // test()
        System.out.println(isEven.test(1));
        System.out.println(isEven.test(2));

        // BiPredicate(T, U)
        BiPredicate<String, String> isSame = String::equalsIgnoreCase;
        System.out.println(isSame.test("Hello", "hello"));

        // and()
        Predicate<Integer> isGreaterThanZero = n -> n > 0;
        Predicate<Integer> isEvenAndGreaterThanZero = isEven.and(isGreaterThanZero);
        System.out.println(isEvenAndGreaterThanZero.test(2));

        // or()
        Predicate<Integer> isEvenOrGreaterThanZero = isEven.or(isGreaterThanZero);
        System.out.println(isEvenOrGreaterThanZero.test(9));

        // negate()
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();
        System.out.println(isNotEmpty.test("Hi"));
    }
}
