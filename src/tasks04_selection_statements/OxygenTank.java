package tasks04_selection_statements;

public class OxygenTank {

    public static void main(String[] args) {

        int number = 75 ;

        if (number >= 90 && number<=100){
            System.out.println("Your tank is full");
        } else if (number<90 && number>=80 ) {
            System.out.println("Still okay");
        } else if (number<80 && number>=70) {
            System.out.println("Don't go too far");
        }  else if (number<70 && number>=60) {
            System.out.println("Start to head back");
        } else if (number<60 && number>=50) {
            System.out.println("Be careful, you're at 50%");
        }
    }
}
