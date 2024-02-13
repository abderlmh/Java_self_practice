package tasks10_arraylist;

import java.util.ArrayList;
import java.util.Arrays;


public class SameFirstAndLast {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.addAll(Arrays.asList("Anna","Canada","Bob","David","Lan","Abida","Ebrahim","Farida"));

        list.removeIf(i->i.substring(0,1).equalsIgnoreCase(i.substring(i.length()-1)));

        System.out.println(list);

    }

}





