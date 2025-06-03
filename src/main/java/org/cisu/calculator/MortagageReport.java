package org.cisu.calculator;

import java.text.NumberFormat;

public class MortagageReport {
    public static void printMortgage(int principal, float annualInterest, byte years) {
        double mortgage = CalculatorProject.calculateMonthly(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("---------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public static void printPaymentSchedule(byte years, int principal, float annualInterest) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("---------");
        for (short month = 1; month <= years * CalculatorProject.MONTHS_IN_YEAR; month++) {
            double balance = CalculatorProject.calculateBalance(principal, annualInterest, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }
}
