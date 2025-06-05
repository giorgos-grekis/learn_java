package org.cisu;

public class TaxCalculator {
    private double taxableIncome;

    TaxCalculator(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double calculateTax() {
        return taxableIncome * 0.3;
    }
}
