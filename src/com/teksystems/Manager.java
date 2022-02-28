package com.teksystems;

public class Manager extends Employee {

    //constructor
    public Manager(long employeeId, String employeeName, String employeeAddress, Long employeePhone, Double basicSalary) {
        super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary);
    }

    //methods
    @Override
    public Double calculateTransportAllowance(){
        double transportationAllowance;
        transportationAllowance = basicSalary * .15;
        return transportationAllowance;
    }

}
