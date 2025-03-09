package org.cs.functionalinterface;

import java.util.UUID;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {

        // get()
        Supplier<Integer> rand = () -> (int) (Math.random() * 100);
        System.out.println(rand.get());

        Supplier<String> randStr = () -> "x0" + UUID.randomUUID().toString().replace("-", "");
        System.out.println(randStr.get());
    }
}
