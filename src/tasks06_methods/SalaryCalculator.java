package tasks06_methods;

public class SalaryCalculator {

    public static void main(String[] args) {

        double income = salary(45,40);
        System.out.println(income);
    }

    public static double salary(double hourlyRate , int weeklyHours ){

        double income = hourlyRate * weeklyHours * 52;

        return income;
    }
}
