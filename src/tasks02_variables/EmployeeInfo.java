package m10_variable_tasks2;

public class EmployeeInfo {

    public static void main(String[] args) {

        String employeeName ="Shay";
        short age = 25;
        char gender = 'f';
        String companyName = "Apple Inc";
        String jobTittle = "SDET";
        double yearsOfExperience = 2.5;
        int salary = 120_000;
        boolean isFullTime = true;
        boolean isMarried = false;
        String employeeId = "B101";
        System.out.println();

        System.out.println("Employee name : "+employeeName);
        System.out.println("Gender : "+gender);
        System.out.println("Age : "+age);
        System.out.println("Employee ID : "+employeeId);
        System.out.println("Job title : "+jobTittle);
        System.out.println("Company name : "+companyName);
        System.out.println("Full time : "+isFullTime);
        System.out.println("Years of work experience : "+yearsOfExperience+" years");
        System.out.println("Salary : $"+salary);
        System.out.println("Married :"+isMarried);


    }
}
