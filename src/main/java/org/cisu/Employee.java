package org.cisu;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    // a value is independent of objects
    public static int numberOfEmployees;

    public Employee(int baseSalary) {
//        this.baseSalary = baseSalary;
//        setBaseSalary(baseSalary);
        // same as above
        this(baseSalary, 0);
    }

    public Employee(int baseSalary, int hourlyRate) {
//        this.baseSalary = baseSalary;
//        this.hourlyRate = hourlyRate;
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("baseSalary must be greater than zero");
        this.baseSalary = baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("hourlyRate must be greater than zero");
        this.hourlyRate = hourlyRate;
    }

    public static void printNumberOfEmployees() {
        System.out.println(numberOfEmployees);
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    public int calculateWage() {
//        return baseSalary;
        return calculateWage(0);
    }

}
