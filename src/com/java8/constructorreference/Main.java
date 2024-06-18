package com.java8.constructorreference;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args){

        // Using a constructor reference to create an employee object
        Supplier<Employee> employeeSupplier = Employee::new;

        Employee employee = employeeSupplier.get();
        System.out.println(employee);
    }
}
