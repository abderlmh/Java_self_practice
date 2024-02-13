package tasks11_classa_and_object_part2;

public class EmployeeClients {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Hazel",16,'M',"Java Developer",100_000);
        employee1.work();
        System.out.println(employee1);
    }
}
