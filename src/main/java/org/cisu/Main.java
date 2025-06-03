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
        var employee1 = new Employee(10_000);
        var employee = new Employee(
                50_000, 10);
        int wage = employee.calculateWage(10);
        int wage2 = employee.calculateWage();
        System.out.println(wage);
        System.out.println(wage2);

       Employee.printNumberOfEmployees();
    }
}