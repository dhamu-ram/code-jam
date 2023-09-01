package com.dhamuram.codejam.designpattern.creational.prototype;

public class EmployeeRecord implements Prototype {

    private int id;

    private String name;

    private String designation;

    private double salary;

    private String address;

    public EmployeeRecord() {
        System.out.println("Employee Records");
        System.out.println("ID: " + id + " Name: " + name + " Designation: " + designation + " Salary: " + salary + " Address: " + address);
    }

    public EmployeeRecord(int id, String name, String designation, double salary, String address) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
    }

    void showRecord() {
        System.out.println("ID: " + id + ", Name: " + name + ", Designation: " + designation + ", Salary: " + salary + ", Address: " + address);
    }

    @Override
    public Prototype getClone() {
        return new EmployeeRecord(id, name, designation, salary, address);
        // return new EmployeeRecord();
    }
}
