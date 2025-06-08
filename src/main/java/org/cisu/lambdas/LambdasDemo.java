package org.cisu.lambdas;


import javax.naming.BinaryRefAddr;
import java.util.List;
import java.util.function.*;

public class LambdasDemo {
    public  String prefix = "-";

    public void show() {

        // The UnaryOperator Interface
        UnaryOperator<Integer> square = x -> x * x;
        UnaryOperator<Integer> increment = x -> x + 1;

        var result = increment.andThen(square).apply(1);
        System.out.println(result);


//        // The BinaryOperator Interface
//        //a,b -> a + b -> square
//        BinaryOperator<Integer> add = (a, b) -> a + b;
//        Function<Integer, Integer> square = (a) -> a * a;
//
//        var result = add.andThen(square).apply(1,2);
//        System.out.println(result);


//        // Combining Predicate
//        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
//        Predicate<String> hasRightBrace = str -> str.endsWith("{");
//
//        Predicate<String> hasLeftAndRightBraces = hasLeftBrace.and(hasRightBrace);
//        var result = hasLeftAndRightBraces.test("{key:value}");
//        System.out.println(result);


//        // The predicate Interface
//        Predicate<String> isLongerThan5 = str -> str.length()> 5;
//        var result = isLongerThan5.test("sky");
//        System.out.println(result);

//        // Composing Function
//        Function<String, String> replaceColon =
//                str -> str.replaceAll(":", "=");
//        Function<String, String> addBraces = str -> "{" + str + "}";
//
//        // Declarative Programming
//        var result = replaceColon
//                .andThen(addBraces)
//                .apply("key:value");
//
//        var result2 = addBraces.compose(replaceColon).apply("key:value");
//
//        System.out.println(result);
//        System.out.println(result2);


//        // The Function Interface
//        Function<String, Integer> map = str -> str.length();
//        var length = map.apply("Sky");
//        System.out.println(length);

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
