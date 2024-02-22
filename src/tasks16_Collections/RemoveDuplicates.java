package tasks16_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(20,15,10,20,30,10,20,15,0));
        removeDuplicate(list);
        System.out.println(list);


    }

    public static void removeDuplicate(List<Integer> list){
        List<Integer> newList = new ArrayList<>();

        for (Integer each : list) {
            if (newList.contains(each)){
                continue;
            }
            newList.add(each);
        }

        list.clear();
        list.addAll(newList);
        Collections.sort(list);

    }
}
