package org.cisu.calculator;

public class MortgageCalculator {
    private int principal;
    private float annualInterest;
    private byte years;

    public MortgageCalculator(int principal, float annualInterest, byte years) {
        this.years = years;
        this.annualInterest = annualInterest;
        this.principal = principal;
    }

    public double calculateBalance(short numberOfPaymentsMade) {
        float monthlyInterest = annualInterest / CalculatorProject.PERCENT / CalculatorProject.MONTHS_IN_YEAR;
        short numberOfPayments = (short) (years * CalculatorProject.MONTHS_IN_YEAR);

        double balance = (principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade)))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }

    public double calculateMortgage() {
        float monthlyInterest = annualInterest / CalculatorProject.PERCENT / CalculatorProject.MONTHS_IN_YEAR;
        short numberOfPayments = (short) (years * CalculatorProject.MONTHS_IN_YEAR);

        return principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }
}
