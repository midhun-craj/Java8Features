package org.cs.anonymousinnerclass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        // Since lambda can't be used for multiple abstract methods inside a interface we can make use of Anonymous Inner Class
        MultiAbstractMethods method1 = new MultiAbstractMethods() {
            @Override
            public void run() {
                System.out.println("I'm running.");
            }

            @Override
            public void walk() {
                System.out.println("I'm walking.");
            }
        };

        method1.run();
        method1.walk();
    }
}
