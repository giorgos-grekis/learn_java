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

        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Principal ($1k - $1M): ");
                principal = scanner.nextInt();

                if (principal < 1000 || principal > 1_000_000) {
                    System.out.println("Enter a number between 1,000 and 1.000.000");
                    return;
                }
                break;
            }

            while (true) {
                System.out.print("Annual Interest Rate: ");
                var annualInterest = scanner.nextFloat();

                if (annualInterest <= 0 || annualInterest >= 30) {
                    System.out.println("Enter a value greater than 0 and less or equal than 30");
                    return;
                }

                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

                break;

            }

            while (true) {
                System.out.print("Period (Years): ");
                byte years = scanner.nextByte();
                if (years >= 1 || years <= 30) {
                    numberOfPayments = years * MONTHS_IN_YEAR;
                    break;
                }

                System.out.println("Enter a value between 1 and 30.");


            }



            double mortage = principal
                    * (monthlyInterest *Math.pow(1 + monthlyInterest, numberOfPayments))
                    / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

            String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortage);

            System.out.println("Mortgage: " + mortgageFormatted);









    }
}
