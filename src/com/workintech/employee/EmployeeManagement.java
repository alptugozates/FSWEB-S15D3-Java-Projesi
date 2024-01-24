package com.workintech.employee;

import java.util.HashMap;
import java.util.LinkedList;

public class EmployeeManagement {
    public static void main(String[] args) {
        LinkedList<Employee> employeeList = new LinkedList<>();
        employeeList.add(new Employee(1, "John", "Doe"));
        employeeList.add(new Employee(2, "John", "Doe"));
        employeeList.add(new Employee(3, "John", "Smith"));
        employeeList.add(new Employee(1, "John", "Doe"));

        HashMap<Integer, Employee> uniqueEmployeeMap = new HashMap<>();
        LinkedList<Employee> duplicateEmployeeList = new LinkedList<>();

        for (Employee employee : employeeList) {
            if (!uniqueEmployeeMap.containsKey(employee.id)) {
                uniqueEmployeeMap.put(employee.id, employee);
            } else {
                duplicateEmployeeList.add(employee);
            }
        }

        employeeList.removeAll(duplicateEmployeeList);

        System.out.println("Unique Employees: ");
        for(Employee employee : uniqueEmployeeMap.values()) {
            System.out.println("ID : " + employee.id + "Name: " + employee.firstname + "Lastname: " + employee.lastname);

        }
        System.out.println("Duplicated Employees: ");
        for(Employee employee : duplicateEmployeeList){
            System.out.println("ID: " + employee.id + "Name: " + employee.firstname + "Lastname: " + employee.lastname);
        }
    }
}
