package com.designpatterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public List<Employee> getEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();

        Employee employeeFromDb = new EmployeeDB("1234", "Shiva", "Teja", "ShivaTeja.Mummadi@gmail.com");
        employeeList.add(employeeFromDb);

        EmployeeLdap employeeLdap = new EmployeeLdap("123", "surname", "givenName", "abc@gmail.com");
        employeeList.add(new EmployeeAdapterLdap(employeeLdap));

        EmployeeCSV employeeCSV = new EmployeeCSV("123, Shiv, Tej, Shiv@gmail.com");
        employeeList.add(new EmployeeAdapterCSV(employeeCSV));
        return employeeList;
    }
}
