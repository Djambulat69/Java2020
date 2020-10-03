package ru.capchik.java2020.Ex9;

public class SalarySelector implements EmployeeSelector {
    private double min_salary;
    public SalarySelector(double min_salary){
        this.min_salary = min_salary;
    }
    @Override
    public boolean select_emp(Employee emp) {
        return emp.getSalary() > min_salary ;
    }
}
