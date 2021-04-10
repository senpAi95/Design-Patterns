package com.designpatterns.behavioral.memento;

public class MementoPattern {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        Employee employee= new Employee();

        employee.setName("John");
        employee.setAddress("1234 Main Street");
        employee.setPhone("123-456-7890");

        System.out.println("Employee before save:        " + employee);

        caretaker.save(employee);

        employee.setPhone("0987-1234-234");
        caretaker.save(employee);

        System.out.println("Employee after save:         " + employee);

        employee.setPhone("abc-def-ghij"); // we haven't called save()

        caretaker.revert(employee);
        System.out.println("Reverts to last save point:  " + employee);

        caretaker.revert(employee);
        System.out.println("Reverts to Original:         " + employee);
    }
}

/**
 * Employee before save:        Employee{name='John', phone='123-456-7890'}
 * Employee after save:         Employee{name='John', phone='0987-1234-234'}
 * Reverts to last save point:  Employee{name='John', phone='0987-1234-234'}
 * Reverts to Original:         Employee{name='John', phone='123-456-7890'}
 */
