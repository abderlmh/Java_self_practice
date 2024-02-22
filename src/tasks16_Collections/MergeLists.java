package tasks16_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeLists {

    public static void main(String[] args) {

        List<Integer> list1 = new LinkedList<>(Arrays.asList(10,20,30,40,50,60,70));
        List<Integer> list2 = new LinkedList<>(Arrays.asList(30,40,50,60,70,80,90,100));

        List<Integer> list3 = new LinkedList<>();
        list3.addAll(list1);
        System.out.println(list3);

        for (Integer each : list2) {
            if (list3.contains(each)){
                continue;
            }
                list3.add(each);
            }
           System.out.println(list3);
        }
    }

