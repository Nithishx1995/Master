package src.com.wipropractices.day3.assignment4;

class Employee {
    String name;
    int age;
    double salary;

    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }


    public String getName() { return name; }
    public int getAge() { return age; }
    public double getSalary() { return salary; }
}

