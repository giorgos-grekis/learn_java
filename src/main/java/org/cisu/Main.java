package org.cisu;

/** class
 *  A blueprint for creating objects
 */

/** Object
 * An instance of a class
 */

/***
 *  Heap => store Objects
 *  Stack => Primitives and short-lived variables
 */

public class Main {

    public static void main(String[] args) {
        var employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }


}