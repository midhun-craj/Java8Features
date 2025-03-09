package org.cs.lambda;

public class Lambdas {
    public static void main(String[] args) {
//        Cat cat = new Cat();

        // Lambda Expression
        printThing((p, s) -> p + "Meow!" + s);
    }
    public static void printThing(Printable thing) {
        String result = thing.print("Mrs. ", " Cat");
        System.out.println(result);
    }
}
