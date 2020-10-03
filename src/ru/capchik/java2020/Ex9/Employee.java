package ru.capchik.java2020.Ex9;

import java.time.LocalDate;

public class Employee {
    private String last_name;
    private String first_name;
    private LocalDate birthday;
    private String address;
    private String number;
    private double salary;

    public Employee(double salary){
        this.salary = salary;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "last_name='" + last_name + '\'' +
                ", first_name='" + first_name + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                ", salary=" + salary +
                '}';
    }
}
