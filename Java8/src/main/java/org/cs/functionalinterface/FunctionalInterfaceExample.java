package org.cs.functionalinterface;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {

        // Using Anonymous Inner Class
        MyFunctionalInterface myFunctionalInterface1 = new MyFunctionalInterface() {
            @Override
            public void sayHi() {
                System.out.println("Hi, I'm java using Anonymous Inner Class.");
            }
        };
        myFunctionalInterface1.sayHi();

        // Using Lambda Expressions
        MyFunctionalInterface myFunctionalInterface2 =
                () -> System.out.println("Hi, I'm java using Lambda Expressions.");
        myFunctionalInterface2.sayHi();
    }
}
