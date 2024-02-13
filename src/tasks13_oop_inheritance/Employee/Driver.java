package tasks13_oop_inheritance.Employee;

public class Driver extends Employee{

    public Driver(String name, int age, char gender, String employeeId, String jobTitle, double salary, String companyName) {
        super(name, age, gender, employeeId, jobTitle, salary, companyName);
    }

    @Override
    public void work() {
        System.out.println("["+getName()+"]"+" is driving ");
    }
}
