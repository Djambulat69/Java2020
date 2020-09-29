package ru.capchik.java2020.Ex7_8;

import java.util.Random;

public class Manager extends Employee implements EmployeePosition {
    private int for_income;

    public Manager(double baseSalary) {
        jobTitle = "Manager";
        Random r = new Random();
        for_income = 115000 + r.nextInt(25000);
        Company.income += for_income;
        salary = calcSalary(baseSalary);
    }


    public int getFor_income() {
        return for_income;
    }

    @Override
    public String getJobTitle() {
        return super.getJobTitle();
    }

    @Override
    public double calcSalary(double baseSalary) {
        Random r = new Random();
        double bonus = 0.05 * for_income;
        return bonus + baseSalary;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "for_income=" + for_income +
                ", salary=" + salary +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
