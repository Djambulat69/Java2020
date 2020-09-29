package ru.capchik.java2020.Ex7_8;

public abstract class Employee {
    protected String lastname;
    protected String firstname;
    protected double salary;
    protected String jobTitle;

    public Employee() {
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public Employee(String lastname, String firstname) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public String getFirstname() {
        return firstname;
    }
    public String getJobTitle() {
        return jobTitle;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", salary=" + salary +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
