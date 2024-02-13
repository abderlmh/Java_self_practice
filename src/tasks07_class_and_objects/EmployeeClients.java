package tasks07_class_and_objects;

import tasks07_class_and_objects.Employee;

public class EmployeeClients {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Abderrazak",28,'M',"Uber driver",22);
        System.out.println(employee1);
        employee1.work();

        Employee employee2 = new Employee("Alyssa",21,'F',"Nurse",21.21);
        System.out.println(employee2);
        employee2.work();

    }
}
