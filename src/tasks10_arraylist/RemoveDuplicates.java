package tasks10_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,6,7));

        for (int i = 0; i <= list.size(); i++) {

            if (list.get(i) == list.get(i+1)){
                list.remove(i);
            }
            if (list.get(i)>=list.size()-1){
                break;
            }
        }
        System.out.println(list);


        }

    }

