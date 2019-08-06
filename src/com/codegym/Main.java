package com.codegym;

import com.sun.xml.internal.ws.message.EmptyMessageImpl;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Animal lion = new Lion();

        lion.run();

        Employee employee = new Employee();


        // Anonymous class
        EmployeeInterface employeeInterface = new EmployeeInterface() {
            @Override
            public void showInfo() {

            }

            @Override
            public void addEmployee() {

            }

            @Override
            public void removeEmployee() {

            }
        };
    }
}
