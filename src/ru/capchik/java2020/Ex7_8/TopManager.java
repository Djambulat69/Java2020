package ru.capchik.java2020.Ex7_8;

public class TopManager extends Employee implements EmployeePosition{


    public TopManager(double baseSalary) {
        jobTitle = "TopManager";
        salary = calcSalary(baseSalary);
    }



    @Override
    public String getJobTitle() {
        return super.getJobTitle();
    }

    @Override
    public double calcSalary(double baseSalary) {
        double bonus = 0;
        if (Company.getIncome() > 10000000) bonus = baseSalary * 1.5;
        return baseSalary + bonus;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
