package tasks16_Collections;

import java.util.*;

public class MergeLists {

    public static void main(String[] args) {

/*
        Set<Integer> set1 = new LinkedHashSet<>(Arrays.asList(10,20,30,40,50,60,70));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(30,40,50,60,70,80,90,100));

        Set<Integer> set3 = new LinkedHashSet<>();
        set3.addAll(set1);
        set3.addAll(set2);
        System.out.println(set3);
*/

        List<Integer> list1 = new LinkedList<>(Arrays.asList(10,20,30,40,50,60,70));
        List<Integer> list2 = new LinkedList<>(Arrays.asList(30,40,50,60,70,80,90,100));

        List<Integer> list3 = new LinkedList<>();
        list3.addAll(list1);



        for (Integer each : list2) {
            if (list3.contains(each)){
                continue;
            }
                list3.add(each);
            }
           System.out.println(list3);

       }
    }

