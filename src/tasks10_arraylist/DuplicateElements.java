package tasks10_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateElements {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        ArrayList<Integer> list2 = new ArrayList<>(list1);

        list2.addAll(list1);

        System.out.println(list2);

    }
}
