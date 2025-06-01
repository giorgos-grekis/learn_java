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

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        var annualInterest = scanner.nextFloat();
        var monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        var years = scanner.nextInt();
        var numberOfPayments = years * MONTHS_IN_YEAR;

        double mortage = principal
                * (monthlyInterest *Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortage);

        System.out.println("Mortgage: " + mortgageFormatted);






    }
}
