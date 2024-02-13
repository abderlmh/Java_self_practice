package tasks09_arrays;

public class EvenOddNumber {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7};
        int countOdd = 0;
        int countEven = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0 ){
                countOdd++;
            }else {
                countEven++;
            }
        }

        System.out.println("The array has "+countOdd+"odd numbers and "+countEven+"even numbers.");
    }
}
