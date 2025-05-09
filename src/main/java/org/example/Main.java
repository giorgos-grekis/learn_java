package org.example;


import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        /**
         * Encapsulation
         * - The process of binding an object state and behavior together into one unit
         * - Wrapping data and code acting on that data together
         * - Prevent classes from being tightly coupled
         * - Easily modify inner working of a class without affecting the rest of program or consumers
         * - Robust to changes
         * - Full Control
         */

        BankAccount account = new BankAccount("Giorgos", BigDecimal.TEN, false);

        System.out.println(account.withdraw(new BigDecimal("9.0")));

        System.out.println(account.getBalance());

        /**
         * Inheritance allows us to create a new class from an existing class.
         * extends
         */

        String[] languages = {"Java", "Go", "JavaScript", "Python", "Typescript"};

        Programmer java = new Programmer(
                "Giorgos",
                36,
                "London",
                "Full Stack",
                languages
        );

//      java.writeSomeCode();
//    System.out.println(java.getAddress());
//    System.out.println(java.getName());

        java.sayHi();

    }






}