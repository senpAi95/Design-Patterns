package com.designpatterns.structural.adapter;

import java.util.List;

/**
 * In this example, {@link Employee} and {@link EmployeeDB} is new code. Legacy code is {@link EmployeeCSV} and
 * {@link EmployeeLdap}. To use legacy code, we use new adapters like {@link EmployeeAdapterCSV} and {@link EmployeeAdapterLdap}.
 */
public class AdapterPattern {
    public static void main(String[] args) {
        EmployeeClient client = new EmployeeClient();

        List<Employee> employeeList = client.getEmployeeList();

        System.out.println(employeeList);
    }
}
