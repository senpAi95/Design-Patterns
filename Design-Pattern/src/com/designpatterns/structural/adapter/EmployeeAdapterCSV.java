package com.designpatterns.structural.adapter;

public class EmployeeAdapterCSV implements Employee {

    EmployeeCSV instance;

    public EmployeeAdapterCSV(EmployeeCSV employeeCSV) {
    }

    @Override
    public String getId() {
        return String.valueOf(instance.getId());
    }

    @Override
    public String getFirstName() {
        return instance.getFirstName();
    }

    @Override
    public String getLastName() {
        return instance.getLastName();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }

}
