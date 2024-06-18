package com.java8.constructorreference;

public class Employee {
    private String name;
    private double salary;

    public Employee(){
        //Default constructor
        this.name = "unkown";
        this.salary = 0.0;
    }

    public  Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}
