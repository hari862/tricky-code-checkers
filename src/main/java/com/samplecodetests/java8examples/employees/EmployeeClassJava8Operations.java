package com.samplecodetests.java8examples.employees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeClassJava8Operations {

    public static void main(String[] args) {
        //Employee emp = new Employee("Hari", "Shankar", 200.00);
        ArrayList<Employee> employees = new ArrayList<>(
                Arrays.asList(
                        new Employee("Hari", "Shankar", 200.00),
                        new Employee("Ravi", "Ranjan", 100.89),
                        new Employee("Kamlesh", "Sharma", 234.40),
                        new Employee("Rohit", "Anand", 178.45)
                )
        );

        ArrayList<Employee> employees2 = new ArrayList<>(employees);

        employees.forEach(System.out::println);
       // employees2.forEach(System.out::println);

        // Employee with Maximum Salary
        Employee employeeWithMaxSalary = employees.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .get();

        System.out.println("Employee with Maximum Salary is - " + employeeWithMaxSalary);

        // employee sorting with salary in ascending order
        List<Employee> sortedEmployeeList = employees.stream()
                .sorted((o1, o2) -> o1.getSalary().compareTo(o2.getSalary()))
                .collect(Collectors.toList());

        System.out.println("Sorted List of employees :" + sortedEmployeeList);

        // employee sorting with salary in ascending order
        List<Employee> descendingSortedEmployeeList = employees.stream()
                .sorted((o1, o2) -> o2.getSalary().compareTo(o1.getSalary()))
                .collect(Collectors.toList());

        System.out.println("Sorted List of employees with descending salary :" + descendingSortedEmployeeList);

        // sorting another way
        // employees.sort((Comparator.comparing(employee -> employee.getFirstName())));
        // employees.sort((Comparator.comparing(Employee::getFirstName)));
        // System.out.println("Employees List sorted as per firstName :" + employees);

    }



}


