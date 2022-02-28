package com.teksystems;

public class InheritanceActivity {
    public void inheritanceActivity() {
        Manager m1 = new Manager(126534L, "Peter", "Chennai India", 237844L, 65000.00);
        System.out.println(m1.employeeName + "'s salary: " + m1.calculateSalary());
        System.out.println(m1.employeeName + "'s transportation allowance: " + m1.calculateTransportAllowance());

        Trainee t1 = new Trainee(29846L, "Jack", "Mumbai India", 442085L, 45000.00);
        System.out.println(t1.employeeName + "'s salary: " + t1.calculateSalary());
        System.out.println(t1.employeeName + "'s transportation allowance: " + t1.calculateTransportAllowance());
    }
}
