package org.cisu;

public class Strings {


    public static void main(String[] args) {
        //    String message = new String("Hello World");

        String message = "Hello \"World\"" + "!!";

        System.out.println(message.endsWith("!!"));
        System.out.println(message.startsWith("!!"));
        System.out.println(message.indexOf("H"));
        System.out.println(message.indexOf("sky"));
        System.out.println(message.replace("!", "*"));
        System.out.println(message);
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
    }
}
