package org.cisu;

public class TaxCalculator2018 implements TaxCalculator {
    private double taxableIncome;

    TaxCalculator2018(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax() {
        return taxableIncome * 0.3;
    }
}
