package com.codegym;

public class Employee  implements EmployeeInterface, CustomerInterface{
    @Override
    public void showInfo() {
        System.out.println(EmployeeInterface.ORIENTATION_DOWN);
    }

    @Override
    public void addEmployee() {

    }

    @Override
    public void removeEmployee() {

    }
}
