package src.com.wipropractices.day1.employee.impl;

import src.com.wipropractices.day1.employee.entity.Employee;
import src.com.wipropractices.day1.employee.service.EmployeeProcessor;

import java.util.Arrays;
import java.util.List;

public class EmployeeProcessorImpl implements EmployeeProcessor {

    Employee emp;

    @Override
    public void displayEmployee(List<Employee> emp) {
        System.out.println("List of Employees");
    }
}
