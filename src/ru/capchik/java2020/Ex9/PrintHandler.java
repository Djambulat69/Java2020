package ru.capchik.java2020.Ex9;

public class PrintHandler implements EmployeeHandler {
    private Company company;
    public PrintHandler(Company company){
        this.company = company;
    }

    @Override
    public void handle(Employee emp) {
        System.out.println(emp);;
    }
}
