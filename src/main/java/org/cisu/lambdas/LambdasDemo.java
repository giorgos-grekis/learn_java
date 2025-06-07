package org.cisu.lambdas;

public class LambdasDemo {
    public  String prefix = "-";

    public void show() {
        greet(message -> System.out.println(this.prefix + message));



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


}
