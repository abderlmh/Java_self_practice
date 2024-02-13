package tasks10_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumAndMinimunNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        int max = list.get(0);
        int min = list.get(0);

        for (Integer i : list) {
            if(max<i){
                max = i ;
            }
            if (min>i){
                min = i;
            }
        }

        System.out.println("Maximum number is : " + max);
        System.out.println("Minimum Number is : " + min);
    }
}
