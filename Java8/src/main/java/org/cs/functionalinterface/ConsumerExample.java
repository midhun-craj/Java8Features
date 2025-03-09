package org.cs.functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        // accept()
        Consumer<String> printConsumer = message -> System.out.println("message: " + message);
        printConsumer.accept("You are under arrest.");

        // andThen()
        Consumer<String> upperCaseConsumer = message -> System.out.println(message.toUpperCase());
        Consumer<String> lowerCaseConsumer = message -> System.out.println(message.toLowerCase());
        Consumer<String> combinedConsumer = upperCaseConsumer.andThen(lowerCaseConsumer);
        combinedConsumer.accept("Future");

        // BiConsumer(T, U)
        BiConsumer<String, Integer> details = (name, age)
                -> System.out.println(Character.toUpperCase(name.charAt(0))
                + name.substring(1) + " age is " + age);
        details.accept("midhun", 23);
    }
}
