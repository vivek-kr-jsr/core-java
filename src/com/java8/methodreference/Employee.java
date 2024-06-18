package com.java8.methodreference;

public class Employee {

    private int id;
    private String name;
    private String gender;

    // static method
    static boolean validateEmpDetails(Employee emp){
        if(emp.getId()!=0 && emp.getName()!=null){
            return true;
        }
        return false;
    }

     boolean validateEmpSalary(Employee emp){
        if(emp.getId()!=0 && emp.getSalary()!=0){
            return true;
        }
        return false;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private double salary;


}
