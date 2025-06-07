package org.cisu.lambdas;

public class LambdasDemo {
    public static void show() {
//        greet(message -> System.out.println(message));
        greet(System.out::println);



        greet(new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });
    }


    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
