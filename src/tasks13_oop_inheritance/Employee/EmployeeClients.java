package tasks13_oop_inheritance.Employee;

public class EmployeeClients {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Jasmine ",28,'F',"A01","teacher",5000,"Acme Corporation");
        teacher.work();
        System.out.println(teacher);

        Developer developer = new Developer("Samuel",28,'M',"A02","Developer",
                9000,"Tech Innovations","Java");

        developer.work();
        System.out.println(developer);

        Driver driver = new Driver("Ali", 33, 'M', "A03", "Driver", 2000,"Taxi");
        System.out.println(driver);

        Tester tester = new Tester("Assila",33,'F',"A04","Tester",6000,"Microsoft");
        tester.work();
        System.out.println(tester);
    }
}
