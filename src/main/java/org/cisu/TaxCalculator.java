package org.cisu;

public interface TaxCalculator {
   // declare fields
    // fields are final (const) and static
//    float minimumTax = 100;

    double calculateTax();

    static double getTaxableIncome(double income, double expense) {
        return income - expense;
    }

}
