package tasks09_arrays;

import java.util.Arrays;

public class ArrayElements {

    public static void main(String[] args) {

        int[] numbers = new int[100];


        for (int i = 0 , j=1; i < numbers.length; i++,j++) {
            numbers[i]=j;
        }

        System.out.println(Arrays.toString(numbers));

        System.out.println("---------------------------------------------------");

        for (int i = numbers.length - 1 , j = 1  ; i >= 0; i--,j++) {
            numbers[i] = j ;
        }
        System.out.println(Arrays.toString(numbers));


        System.out.println("--------------------------------------------------");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 5 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
