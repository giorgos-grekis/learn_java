package org.cisu;

public class TaxCalculator2018
        extends AbstractTaxCalculator {
    private double taxableIncome;

    TaxCalculator2018(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax() {
        getTaxableIncome(taxableIncome, taxableIncome);
        return taxableIncome * 0.3;
    }
}
