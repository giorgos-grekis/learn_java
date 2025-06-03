package org.cisu.calculator;

import java.text.NumberFormat;

public class MortgageReport {

    private static MortgageCalculator calculator;



    public static void printMortgage(int principal, float annualInterest, byte years) {
        caclulator = new MortgageCalculator(principal, annualInterest, years);
        double mortgage = caclulator.calculateMortgage();
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
            double balance = MortgageCalculator.calculateBalance(month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }
}
