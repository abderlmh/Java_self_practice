package tasks09_arrays;

import java.util.Arrays;

public class ReversArray {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        int[] reverseArray = reverseArray(array);

        System.out.println(Arrays.toString(reverseArray));

    }


    public static int[] reverseArray (int[]array){

        int [] reverseArray = new int[array.length];

        for (int i = array.length - 1 , j = 0 ; i >= 0; i--,j++) {
            reverseArray[j] = array[i];
        }
        return reverseArray;
    }
}
