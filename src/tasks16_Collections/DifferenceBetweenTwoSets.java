package tasks16_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DifferenceBetweenTwoSets {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2,3,4));

        Set<Integer> set3 = new HashSet<>();
        set3.addAll(set1);
        set3.removeAll(set2);

        System.out.println(set3);
    }
}
