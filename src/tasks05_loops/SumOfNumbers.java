package m18_loops_part3;

public class SumOfNumbers {

    public static void main(String[] args) {
        int number = 100;
        int sum = 0 ;
        for (int i = 1; i <= number  ; i++) {
           sum+=i;
        }
        System.out.println("the sum of all numbers between 1 and " + number + " = "+sum );
    }
}
