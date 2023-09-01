package com.dhamuram.codejam.designpattern.creational.prototype;

public class ProtoTypeImplementation {
    public static void main(String[] args) {

        // Initialize Employee Record 1
        EmployeeRecord er1 = new EmployeeRecord(100, "David Ron", "Software Engineer", 60000.00, "NJ");

        er1.showRecord();

        // Clone Employee Record 1 to Employee Record 2
        EmployeeRecord er2 = (EmployeeRecord) er1.getClone();

        er2.showRecord();
    }
}
