package ru.capchik.java2020.Ex7_8;

import java.util.ArrayList;
import java.util.List;


public class Company {
    static int income;

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

    public static int getIncome(){
        return income;
    }

    public List<Employee> getTopSalaryStaff(int count){
        if (count > 1 && count <= employees.size()) {
            ArrayList<Employee> sortedemps = new ArrayList<>(employees);
            for (int i = 0; i < sortedemps.size(); i++) {
                for (int j = 0; j < sortedemps.size() - 1; j++) {
                    if (sortedemps.get(j).getSalary() < sortedemps.get(j + 1).getSalary()) {
                        Employee t = sortedemps.get(j);
                        sortedemps.set(j, sortedemps.get(j + 1));
                        sortedemps.set(j + 1, t);
                    }
                }
            }
            return sortedemps.subList(0, count);
        }
        else {
            ArrayList<Employee> empty = new ArrayList<Employee>();
            return empty;
        }
    }
    public List<Employee> getLowestSalaryStaff(int count){
        if (count > 1 && count <= employees.size()) {
            ArrayList<Employee> sortedemps = new ArrayList<Employee>(employees);
            for (int i = 0; i < sortedemps.size(); i++) {
                for (int j = 0; j < sortedemps.size() - 1; j++) {
                    if (sortedemps.get(j).getSalary() > sortedemps.get(j + 1).getSalary()) {
                        Employee t = sortedemps.get(j);
                        sortedemps.set(j, sortedemps.get(j + 1));
                        sortedemps.set(j + 1, t);
                    }
                }
            }
            return sortedemps.subList(0, count);
        }
        else {
            ArrayList<Employee> empty = new ArrayList<Employee>();
            return empty;
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "employees=" + employees +
                '}';
    }
}