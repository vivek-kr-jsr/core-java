package com.java8.methodreference;

public class MethodReferenceDemoMain {

    public static void main(String[] args){
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        emp2.setId(1);
        emp2.setName("Vivek");

        // static reference
        EmployeeValidation employeeValidation = Employee::validateEmpDetails;

        System.out.println(employeeValidation.isValidEmployee(emp1));
        System.out.println(employeeValidation.isValidEmployee(emp2));

        // Instance Reference
        EmployeeSalaryValidation employeeSalaryValidation = emp1::validateEmpSalary;
        System.out.println(employeeValidation.isValidEmployee(emp1));

        // access instance method with class name


    }
}
