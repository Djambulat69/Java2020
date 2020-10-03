package ru.capchik.java2020.Ex9;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        Random r = new Random();
        Employee[] employees = new Employee[20];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee(20000 + r.nextInt(20000));
            company.hire(employees[i]);
        }

        SalarySelector salarySelector = new SalarySelector(30000);
        PrintHandler printHandler = new PrintHandler(company);
        company.HandleEmployees(salarySelector, printHandler);  // Отдельными классами
        System.out.println();
        company.HandleEmployees(new EmployeeSelector() {        // Анонимными классами
            @Override
            public boolean select_emp(Employee emp) {
                return emp.getSalary() > 30000;
            }
        }, new EmployeeHandler() {
            @Override
            public void handle(Employee emp) {
                System.out.println(emp);
            }
        });
        System.out.println();
        company.HandleEmployees((emp) -> emp.getSalary() > 30000, (emp) -> System.out.println(emp)); // Лямбда-выражениями
    }
}
