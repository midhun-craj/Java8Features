package org.cs.anonymousinnerclass;

public class ForRunnableInterface {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                System.out.println("Hi, I'm runnable interface, horaaah!");
            }
        };

        runnable.run();
    }
}
