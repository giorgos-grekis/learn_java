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

        int principal = 0;
        float annualInterest = 0;
        byte years = 0;


        Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Principal ($1k - $1M): ");
                principal = scanner.nextInt();

                if (principal >= 1000 && principal <= 1_000_000) {
                    break;
                }
                System.out.println("Enter a number between 1,000 and 1.000.000");

            }

            while (true) {
                System.out.print("Annual Interest Rate: ");
                annualInterest = scanner.nextFloat();

                if (annualInterest >= 1 && annualInterest <= 30)
                    break;

                System.out.println("Enter a value greater than 0 and less or equal than 30");

            }

            while (true) {
                System.out.print("Period (Years): ");
                years = scanner.nextByte();
                if (years >= 1 && years <= 30)
                    break;

                System.out.println("Enter a value between 1 and 30.");
            }

        double mortage = calculateMonthly(principal, annualInterest, years);


            String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortage);

            System.out.println("Mortgage: " + mortgageFormatted);
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
