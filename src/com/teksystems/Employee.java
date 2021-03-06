package com.teksystems;

public class Employee {

    //fields
    public Long employeeId;
    public String employeeName;
    public String employeeAddress;
    public Long employeePhone;
    public Double basicSalary;
    public Double specialAllowance = 250.80;
    public Double hra = 1000.50;

    //constructor
    public Employee(long employeeId, String employeeName, String employeeAddress, Long employeePhone, Double basicSalary){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
        this.basicSalary = basicSalary;
    }

    //methods
    public Double calculateSalary(){
       return basicSalary + ( basicSalary * specialAllowance/100D ) + ( basicSalary * hra/100D );
    }

    public Double calculateTransportAllowance(){
        return basicSalary * .10;
    }

}
