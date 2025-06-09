package org.example.bigDecimalDouble;

import java.math.BigDecimal;

public class BigDecimalDouble {
    // BigDecimal, Double
    double number1 = 0.02;
    double number2 = 0.03;
    double result = number2 - number1;
//        System.out.println(result);

    // whenever works with money(currency) use BigDecimal
    BigDecimal number4 = new BigDecimal("0.02");
    BigDecimal number5 = new BigDecimal("0.03");
    BigDecimal result2 = number4.subtract(number5);
//        System.out.println(result2);

    BigDecimal number = BigDecimal.TEN;

//        System.out.println(number);
//        System.out.println(number.add(BigDecimal.ONE));
//        System.out.println(number.max(BigDecimal.ZERO));
//        System.out.println(number.compareTo(BigDecimal.ZERO));
//        System.out.println(number.compareTo(new BigDecimal("11")));

}
