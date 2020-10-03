package ru.capchik.java2020.Ex9;


import java.util.ArrayList;
import java.util.List;

public class Company {
    private ArrayList<Employee> employees = new ArrayList<>();
    public void hire(Employee emp){
        if (!(employees.contains(emp))) {
            employees.add(emp);
        }
        else System.out.println("Company already has " + emp);
    }

    public void hireAll(List<Employee> newEmps){
        for (int i = 0; i < newEmps.size(); i++){
            this.hire(newEmps.get(i));
        }
    }

    public void fire(Employee emp){
        if (employees.contains(emp)) {
            employees.remove(emp);
        }
        else System.out.println("Company hasn't " + emp);
    }

    public void HandleEmployees(EmployeeSelector selector, EmployeeHandler handler){ ;
        for (Employee emp: employees) {
            if(selector.select_emp(emp)){
                handler.handle(emp);
            }
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "employees=" + employees +
                '}';
    }
}
