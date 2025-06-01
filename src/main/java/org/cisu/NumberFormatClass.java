package org.cisu;

import java.text.NumberFormat;

public class NumberFormatClass {

    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String resultCurrency = currency.format(1234567.891);
        System.out.println(resultCurrency);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String resultPercent = percent.format(0.1);
        System.out.println(resultPercent);

        // method chaining
        var result = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result);
    }

}
