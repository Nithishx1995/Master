package src.com.wipropractices.day1.employee;

import src.com.wipropractices.day1.employee.entity.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        {
            List<Employee> emp=  new ArrayList<>();
            emp.add(new Employee(1,"Nithish","Happy",20000));
            emp.add(new Employee(2,"Hello","Goooie Homes",15000));

            Iterable<Employee> it= new ArrayList<>();
            it.forEach(System.out::println);
        }
    }
}
