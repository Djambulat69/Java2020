package ru.capchik.java2020.Ex7_8;

public class Operator extends Employee_ implements EmployeePosition{



    public Operator(double baseSalary) {
        jobTitle = "Operator";
        salary = baseSalary;
    }

    @Override
    public String getJobTitle() {
        return super.getJobTitle();
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
