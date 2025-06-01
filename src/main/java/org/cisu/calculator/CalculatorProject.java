package org.cisu.calculator;

import java.text.NumberFormat;
import java.util.Scanner;

// Principal: 100000 => p
// Annual Interest Rate: 3.92 => r (3.92/100)
// Period (Years): 30 => n (30/12)
// returns => Mortgage: $472.81
// formula
// M = p*( (r*(1+1)^n) / ((1+r)^n - 1) )
public class CalculatorProject {

    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {

        int principal =  (int) readNumber("Principal ($1k - $1M): ", 1000, 1_000_000);
        float annualInterest =  (float) readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) readNumber("Period (Years): ", 1, 30);

        double mortage = calculateMonthly(principal, annualInterest, years);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("---------");
        System.out.println("Monthly Payments: " + mortgageFormatted);


        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("---------");
        for (short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
            double balance = calculateBalance(principal, annualInterest, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }

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

    public static double calculateBalance(
            int principal,
            float annualInterest,
            byte years,
            short numberOfPaymentsMade
    ) {


        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short)(years * MONTHS_IN_YEAR);

        double balance = (principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade)))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }

    public static double calculateMonthly(
            int principal,
            float annualInterest,
            byte years) {

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short)(years * MONTHS_IN_YEAR);


        double mortage = principal
                * (monthlyInterest *Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortage;
    }

}
