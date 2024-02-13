package tasks09_arrays;

import java.util.Arrays;

public class MoveTheZeros {

    public static void main(String[] args) {

        int[] array = {10,0,5,0,1,0};
        int[] array2 = new int[array.length];

        for (int i = 0 , j = 0; i < array.length; i++) {

            if (array[i] > 0){
                array2[j++]=array[i];
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}
