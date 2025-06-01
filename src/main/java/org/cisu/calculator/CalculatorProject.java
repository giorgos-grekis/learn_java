package org.cisu.calculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class CalculatorProject {
    // Principal: 100000 => p
    // Annual Interest Rate: 3.92 => r (3.92/100)
    // Period (Years): 30 => n (30/12)


    // returns => Mortgage: $472.81

    // formula
    // M = p*( (r*(1+1)^n) / ((1+r)^n - 1) )

    public static void main(String[] args) {

        int principal =  (int) readNumber("Principal ($1k - $1M): ", 1000, 1_000_000);
        float annualInterest =  (float) readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) readNumber("Period (Years): ", 1, 30);

        double mortage = calculateMonthly(principal, annualInterest, years);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortage);

        System.out.println("Mortgage: " + mortgageFormatted);
    }

    public static double readNumber(
            String prompt,
            double min,
            double max) {
        Scanner scanner = new Scanner(System.in);
        double value = 0;

        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();

            if (value >= min && value <= max) {
                break;
            }
            System.out.println("Enter a number between " + min + " and " + max);
        }

        return value;
    }

    public static double calculateMonthly(
            int principal,
            float annualInterest,
            byte years) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short)(years * MONTHS_IN_YEAR);


        double mortage = principal
                * (monthlyInterest *Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortage;
    }

}
