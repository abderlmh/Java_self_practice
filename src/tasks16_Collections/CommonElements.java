package tasks16_Collections;

import java.util.*;

public class CommonElements {

    public static void main(String[] args) {


        Set<Integer> set1 = new TreeSet<>(Arrays.asList(10,8,11,20,5,0));
        Set<Integer> set2 = new TreeSet<>(Arrays.asList(30,0,20,40,50,10,60));



        Set<Integer> set3 = new TreeSet<>();

        for (Integer i : set1) {
            for (Integer integer : set2) {
                if (i.equals(integer)){
                    set3.add(i);
                }
            }
        }

        System.out.println(set3);


/*
        List<Integer> set1 = new LinkedList<>(Arrays.asList(10,8,11,20,5,0));
        List<Integer> set2 = new LinkedList<>(Arrays.asList(30,0,20,40,50,10,60));

        List<Integer> set3 = new LinkedList<>();

        Collections.sort(set1);

        for (int i = 0; i < set1.size(); i++) {
            for (int j = 0; j < set2.size(); j++) {
                if (set1.get(i).equals(set2.get(j))){
                    set3.add(set1.get(i));
                }
            }
        }

        System.out.println(set3);

*/
    }
}
