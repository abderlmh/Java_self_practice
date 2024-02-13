package tasks10_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTowArrays {

    public static void main(String[] args) {

        ArrayList<String> arr1 = new ArrayList<>();
        arr1.addAll(Arrays.asList("A","B","C"));

        ArrayList<String> arr2 = new ArrayList<>();
        arr2.addAll(Arrays.asList("D","E","F","G"));

        ArrayList<String> arr3 = new ArrayList<>();
        arr3.addAll(arr1);
        arr3.addAll(arr2);

        System.out.println("List ==> "+arr3);

    }
}
