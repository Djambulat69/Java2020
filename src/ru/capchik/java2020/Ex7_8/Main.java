package ru.capchik.java2020.Ex7_8;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        Manager mng1 = new Manager(10000);
        Manager mng2 = new Manager(15000);
        Manager mng3 = new Manager(20000);
        Manager mng4 = new Manager(30000);
        Manager mng5 = new Manager(35000);

        company.hire(mng1);
        company.hire(mng2);
        company.hire(mng3);
        company.hire(mng4);
        company.hire(mng5);

        Operator[] op = new Operator[180];
        Manager[] mng = new Manager[75];
        TopManager[] tmng = new TopManager[10];

        for (int i = 0; i < 180; i++){
            op[i] = new Operator(50000);
            company.hire(op[i]);
            if (i < 75) {
                mng[i] = new Manager(150000);
                company.hire(mng[i]);
            }
        }
        for (int i = 0; i < 10; i++ ) {
            tmng[i] = new TopManager(90000);
            company.hire(tmng[i]);
        }

        System.out.println("Income = " + company.getIncome());

        System.out.println("\nBefore fire:\n");

        List<Employee_> best15 =  company.getTopSalaryStaff(15);
        for (int i = 0; i < best15.size(); i++){
            System.out.println((i+1) + " = " + best15.get(i).getJobTitle() + " "  + best15.get(i).getSalary() );
        }

        System.out.println();

        List<Employee_> worst15 =  company.getLowestSalaryStaff(30);
        for (int i = 0; i < worst15.size(); i++){
            System.out.println((i+1) + " = " + worst15.get(i).getJobTitle() + " "  + worst15.get(i).getSalary() );
        }

        System.out.println("\nAfter fire:\n");

        for (int i = 0; i < 125; i++){
            company.fire(op[i]);
            if (i < 7) company.fire(mng[i]);
            if (i < 3) company.fire(tmng[i]);
        }

        best15 =  company.getTopSalaryStaff(15);
        worst15 =  company.getLowestSalaryStaff(30);

        for (int i = 0; i < best15.size(); i++){
            System.out.println((i+1) + " = " + best15.get(i).getJobTitle() + " "  + best15.get(i).getSalary() );
        }
        System.out.println();


        for (int i = 0; i < worst15.size(); i++){
            System.out.println((i+1) + " = " + worst15.get(i).getJobTitle() + " "  + worst15.get(i).getSalary() );
        }
    }
}
