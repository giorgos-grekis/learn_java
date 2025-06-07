package org.cisu.lambdas;

public class LambdasDemo {
    public  String prefix = "-";

    public void show() {
        // Lambda Expressions
        greet(message -> System.out.println(this.prefix + message));


        // Method References
        // Class/Object::method
        greet(this::print);
//        greet(LambdasDemo::print); // if it's static




//      // functional Interfaces
//        greet(new Printer() {
//            @Override
//            public void print(String message) {
//                System.out.println(message);
//            }
//        });
    }


    public static void greet(Printer printer) {
        printer.print("Hello World");
    }


    private void print(String message) {
        System.out.println(this.prefix + message);
    }
}
