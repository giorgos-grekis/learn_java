package org.example;

public class Calculator {
    // int ...numbers -> is an array of numbers
    public int add(int ...numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }
}
