package src.com.wipropractices.day1.employee.service;

import src.com.wipropractices.day1.employee.entity.Employee;

import java.util.List;


@FunctionalInterface
public interface EmployeeProcessor {

    abstract void displayEmployee(List<Employee> emp);
}
