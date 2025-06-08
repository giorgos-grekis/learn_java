package org.cisu.lambdas;


import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdasDemo {
    public  String prefix = "-";

    public void show() {

        // The Function Interface
        Function<String, Integer> map = str -> str.length();
        var length = map.apply("Sky");
        System.out.println(length);

//        // The Supplier Interface
//        Supplier<Double> getRandom = Math::random;
//        var random = getRandom.get();
//        System.out.println(random);

//        // Chaining Consumer
//        List<String> list = List.of("a", "b", "c");
////        Consumer<String> print = (String item) -> System.out.println(item);
//        Consumer<String> print = System.out::println;
//        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());
//        list.forEach(print.andThen(printUpperCase).andThen(print));

//        // Lambda Expressions
//        greet(message -> System.out.println(this.prefix + message));
//
//        // Method References
//        // Class/Object::method
//        greet(this::print);
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
