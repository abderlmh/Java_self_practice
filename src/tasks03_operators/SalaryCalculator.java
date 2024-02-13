package m13_operators_part3;

public class SalaryCalculator {

    public static void main(String[] args) {

        double hourlyRate = 50;

        int weeklyHours = 45 ;

        double stateTaxRate = 0.06;

        double federalTaxRate = 0.26 ;

        double GrossPay = (hourlyRate * weeklyHours) * 52;
        double federalTax = GrossPay * federalTaxRate ;
        double stateTax = GrossPay * stateTaxRate;


        System.out.println(" Gross pay is : $ " + GrossPay );
        System.out.println(" Federal tax is : $ " + federalTax);
        System.out.println(" State tax is : $ " + stateTax );
        System.out.println(" Total tax is : $ " + (federalTax + stateTax));
        System.out.println("Net income is : $ " + (GrossPay-federalTax-stateTax));

    }
}
